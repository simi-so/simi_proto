package ch.so.agi.simi.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "SIMI_FACADE_LAYER")
@Entity(name = "simi_FacadeLayer")
public class FacadeLayer extends SingleActor {
    private static final long serialVersionUID = 7872122417388121333L;
}