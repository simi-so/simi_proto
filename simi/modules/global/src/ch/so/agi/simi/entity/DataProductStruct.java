package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.core.global.MetadataTools;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@MappedSuperclass
public class DataProductStruct extends StandardEntity {
    private static final long serialVersionUID = -6791785436085208832L;

    @NotNull
    @Column(name = "IDENTIFIER", nullable = false)
    protected String identifier;

    @Column(name = "TITLE")
    protected String title;

    @NotNull
    @Column(name = "IN_WGC", nullable = false)
    protected Boolean inWGC = false;

    @Lob
    @Column(name = "REMARKS")
    protected String remarks;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getInWGC() {
        return inWGC;
    }

    public void setInWGC(Boolean inWGC) {
        this.inWGC = inWGC;
    }
}