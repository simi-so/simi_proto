package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s (_SA)|identifier")
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "SIMI_SINGLE_ACTOR")
@Entity(name = "simi_SingleActor")
public class SingleActor extends DataProductStruct {
    private static final long serialVersionUID = 847162714173552240L;
}