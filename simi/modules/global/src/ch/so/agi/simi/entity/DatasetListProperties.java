package ch.so.agi.simi.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "SIMI_DATASET_LIST_PROPERTIES")
@Entity(name = "simi_DatasetListProperties")
public class DatasetListProperties extends StandardEntity {
    private static final long serialVersionUID = 44680430332068033L;

    @NotNull
    @Column(name = "VISIBLE", nullable = false)
    protected Boolean visible = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FACADELAYER_ID")
    protected FacadeLayer facadelayer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DATASET_ID")
    protected PostgresDS dataset;

    @NotNull
    @Column(name = "SORT", nullable = false)
    protected Integer sort = 999;

    @Max(100)
    @Min(0)
    @Column(name = "TRANSPARENCY")
    protected Integer transparency = 100;

    public PostgresDS getDataset() {
        return dataset;
    }

    public void setDataset(PostgresDS dataset) {
        this.dataset = dataset;
    }

    public FacadeLayer getFacadelayer() {
        return facadelayer;
    }

    public void setFacadelayer(FacadeLayer facadelayer) {
        this.facadelayer = facadelayer;
    }


    public Integer getTransparency() {
        return transparency;
    }

    public void setTransparency(Integer transparency) {
        this.transparency = transparency;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}