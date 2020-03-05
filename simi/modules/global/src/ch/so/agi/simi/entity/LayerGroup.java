package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Entity;

@NamePattern("%s (LG)|identifier")
@Entity(name = "simi_LayerGroup")
public class LayerGroup extends ProductSet {
    private static final long serialVersionUID = -8517875151185651683L;
}