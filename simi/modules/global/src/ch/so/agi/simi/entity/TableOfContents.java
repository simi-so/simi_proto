package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import com.haulmont.cuba.core.entity.annotation.ConversionType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "SIMI_TABLE_OF_CONTENTS")
@Entity(name = "simi_TableOfContents")
public class TableOfContents extends StandardEntity {
    private static final long serialVersionUID = 1036177823622913121L;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "tableOfContents")
    protected List<SingleActorListProperties> singleActorListProperties;

    @CaseConversion(type = ConversionType.LOWER)
    @NotNull
    @Column(name = "IDENTIFIER", nullable = false, unique = true)
    protected String identifier;

    @Lob
    @Column(name = "REMARKS")
    protected String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<SingleActorListProperties> getSingleActorListProperties() {
        return singleActorListProperties;
    }

    public void setSingleActorListProperties(List<SingleActorListProperties> singleActorListProperties) {
        this.singleActorListProperties = singleActorListProperties;
    }
}