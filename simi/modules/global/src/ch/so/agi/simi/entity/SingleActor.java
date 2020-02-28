package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@NamePattern("%s|identifier")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SIMI_SINGLE_ACTOR")
@Entity(name = "simi_SingleActor")
public class SingleActor extends DataProduct {
    private static final long serialVersionUID = 847162714173552240L;
}