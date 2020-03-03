package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s (FL)|identifier")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SIMI_FACADE_LAYER")
@Entity(name = "simi_FacadeLayer")
public class FacadeLayer extends SingleActor {
    private static final long serialVersionUID = 7872122417388121333L;

    @OrderBy("sort")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "facadelayer")
    protected List<DatasetListProperties> dataSetListProperties;

    public List<DatasetListProperties> getDataSetListProperties() {
        return dataSetListProperties;
    }

    public void setDataSetListProperties(List<DatasetListProperties> dataSetListProperties) {
        this.dataSetListProperties = dataSetListProperties;
    }
}