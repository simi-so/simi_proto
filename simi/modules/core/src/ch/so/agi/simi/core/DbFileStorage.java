package ch.so.agi.simi.core;

import ch.so.agi.simi.entity.FileContent;
import com.google.common.io.ByteStreams;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.app.FileStorageAPI;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.core.global.Metadata;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DbFileStorage implements FileStorageAPI {

    @Inject
    private Persistence persistence;
    @Inject
    private Metadata metadata;

    @Override
    public long saveStream(FileDescriptor fileDescr, InputStream inputStream) throws FileStorageException {
        byte[] data;
        try {
            data = ByteStreams.toByteArray(inputStream);
            saveFile(fileDescr, data);
        } catch (IOException e) {
            throw new FileStorageException(FileStorageException.Type.IO_EXCEPTION, fileDescr.getName(), e);
        }
        return data.length;
    }

    @Override
    public void saveFile(FileDescriptor fileDescr, byte[] data) throws FileStorageException {
        persistence.runInTransaction(em -> {
            FileContent fileContent = metadata.create(FileContent.class);
            fileContent.setId(fileDescr.getId());
            fileContent.setContent(data);
            em.persist(fileContent);
        });
    }

    @Override
    public void removeFile(FileDescriptor fileDescr) throws FileStorageException {
        persistence.runInTransaction(em -> {
            em.createQuery("delete from simi_FileContent f where f.id = ?1")
                    .setParameter(1, fileDescr.getId())
                    .executeUpdate();
        });
    }

    @Override
    public InputStream openStream(FileDescriptor fileDescr) throws FileStorageException {
        return new ByteArrayInputStream(loadFile(fileDescr));
    }

    @Override
    public byte[] loadFile(FileDescriptor fileDescr) throws FileStorageException {
        byte[] data = persistence.callInTransaction(em -> {
            FileContent fileContent = em.find(FileContent.class, fileDescr.getId());
            if (fileContent == null) {
                return null;
            }
            return fileContent.getContent();
        });
        if (data == null) {
            throw new FileStorageException(FileStorageException.Type.FILE_NOT_FOUND, fileDescr.getName());
        }
        return data;
    }

    @Override
    public boolean fileExists(FileDescriptor fileDescr) throws FileStorageException {
        return persistence.callInTransaction(em -> {
            FileContent fileContent = em.find(FileContent.class, fileDescr.getId());
            return fileContent != null;
        });
    }
}
