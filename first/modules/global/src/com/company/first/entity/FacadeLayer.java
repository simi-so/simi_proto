package com.company.first.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "FIRST_FACADE_LAYER")
@Entity(name = "first_FacadeLayer")
public class FacadeLayer extends StandardEntity {
    private static final long serialVersionUID = -4481117822025256577L;

    @NotNull
    @Column(name = "IDENTIFIER", nullable = false, unique = true)
    protected String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}