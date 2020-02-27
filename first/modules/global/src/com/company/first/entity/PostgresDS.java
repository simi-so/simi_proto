package com.company.first.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "FIRST_POSTGRES_DS")
@Entity(name = "first_PostgresDS")
public class PostgresDS extends StandardEntity {
    private static final long serialVersionUID = 8406692921653200069L;

    @NotNull
    @Column(name = "TABLENAME", nullable = false)
    protected String tablename;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FACADE_LAYER_ID")
    protected FacadeLayer facadeLayer;

    @NotNull
    @Column(name = "IN_DATA_SERVICES", nullable = false)
    protected Boolean inDataServices = false;

    @Max(100)
    @Min(0)
    @NotNull
    @Column(name = "DEF_TRANSPARENCY", nullable = false)
    protected Integer defTransparency;

    public FacadeLayer getFacadeLayer() {
        return facadeLayer;
    }

    public void setFacadeLayer(FacadeLayer facadeLayer) {
        this.facadeLayer = facadeLayer;
    }

    public Integer getDefTransparency() {
        return defTransparency;
    }

    public void setDefTransparency(Integer defTransparency) {
        this.defTransparency = defTransparency;
    }

    public Boolean getInDataServices() {
        return inDataServices;
    }

    public void setInDataServices(Boolean inDataServices) {
        this.inDataServices = inDataServices;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
}