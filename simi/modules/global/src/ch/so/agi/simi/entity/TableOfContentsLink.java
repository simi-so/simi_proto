package ch.so.agi.simi.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SIMI_TABLE_OF_CONTENTS_LINK")
@Entity(name = "simi_TableOfContentsLink")
public class TableOfContentsLink extends StandardEntity {
    private static final long serialVersionUID = -4376443695445271694L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCTSET_ID")
    protected ProductSet productset;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TABLE_OF_CONTENTS_ID")
    protected TableOfContents tableOfContents;

    @NotNull
    @Column(name = "SORT", nullable = false)
    protected Integer sort = 999;

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public ProductSet getProductset() {
        return productset;
    }

    public void setProductset(ProductSet productset) {
        this.productset = productset;
    }
}