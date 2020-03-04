package ch.so.agi.simi.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "SIMI_SINGLE_ACTOR_LIST_PROPERTIES")
@Entity(name = "simi_SingleActorListProperties")
public class SingleActorListProperties extends StandardEntity {
    private static final long serialVersionUID = 8831469854854313072L;

    @NotNull
    @Column(name = "VISIBLE", nullable = false)
    protected Boolean visible = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCTSET_ID")
    protected ProductSet productset;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SINGLEACTOR_ID")
    protected SingleActor singleactor;

    @NotNull
    @Column(name = "SORT", nullable = false)
    protected Integer sort = 999;

    @Max(100)
    @Min(0)
    @Column(name = "TRANSPARENCY")
    protected Integer transparency = 100;

    public SingleActor getSingleactor() {
        return singleactor;
    }

    public void setSingleactor(SingleActor singleactor) {
        this.singleactor = singleactor;
    }

    public ProductSet getProductset() {
        return productset;
    }

    public void setProductset(ProductSet productset) {
        this.productset = productset;
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