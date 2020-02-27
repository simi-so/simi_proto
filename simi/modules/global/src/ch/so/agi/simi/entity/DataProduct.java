package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@NamePattern("%s|title")
@Table(name = "SIMI_DATA_PRODUCT")
@Entity(name = "simi_DataProduct")
public class DataProduct extends StandardEntity {
    private static final long serialVersionUID = -8689728264892585455L;

    @NotNull
    @Column(name = "IN_WGC", nullable = false)
    protected Boolean inWGC = false;

    @Column(name = "TITLE")
    protected String title;

    @Lob
    @Column(name = "REMARKS")
    protected String remarks;

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