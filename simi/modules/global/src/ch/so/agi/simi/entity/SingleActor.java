package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s (_SA)|identifier")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SIMI_SINGLE_ACTOR")
@Entity(name = "simi_SingleActor")
public class SingleActor extends DataProduct {
    private static final long serialVersionUID = 847162714173552240L;

    @Lob
    @Column(nullable = false)
    @MetaProperty(mandatory = true)
    @NotNull
    protected String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}