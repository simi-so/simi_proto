package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s (_PS)|identifier")
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "SIMI_PRODUCT_SET")
@Entity(name = "simi_ProductSet")
public class ProductSet extends DataProductStruct {
    private static final long serialVersionUID = 7972395042416963924L;

}