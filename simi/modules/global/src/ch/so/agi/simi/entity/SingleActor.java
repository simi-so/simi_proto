package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import com.haulmont.cuba.core.entity.annotation.ConversionType;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@NamePattern("%s|identifier")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SIMI_SINGLE_ACTOR")
@Entity(name = "simi_SingleActor")
public class SingleActor extends DataProduct {
    private static final long serialVersionUID = 847162714173552240L;

    @Transient
    @MetaProperty(mandatory = true)
    @CaseConversion(type = ConversionType.LOWER)
    @NotNull
    protected String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}