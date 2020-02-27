package com.company.first.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NamePattern("%s|identifier")
@Table(name = "FIRST_SINGLE_ACTOR")
@Entity(name = "first_SingleActor")
public class SingleActor extends StandardEntity {
    private static final long serialVersionUID = -4481117822025256577L;

    @NotNull
    @Column(name = "IN_WMS", nullable = false)
    protected Boolean inWMS = false;

    @NotNull
    @Column(name = "IN_WGC", nullable = false)
    protected Boolean inWGC = false;

    @NotNull
    @Column(name = "IDENTIFIER", nullable = false, unique = true)
    protected String identifier;

    @NotEmpty(message = "'Titel' darf nicht leer sein")
    @Column(name = "TITLE")
    protected String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Boolean getInWGC() {
        return inWGC;
    }

    public void setInWGC(Boolean inWGC) {
        this.inWGC = inWGC;
    }

    public Boolean getInWMS() {
        return inWMS;
    }

    public void setInWMS(Boolean inWMS) {
        this.inWMS = inWMS;
    }
}