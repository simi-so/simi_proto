package ch.so.agi.simi.web.screens.productset;

import ch.so.agi.simi.entity.SingleActorListProperties;
import ch.so.agi.simi.entity.TableOfContentsLink;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.ProductSet;

import javax.inject.Inject;

@UiController("simi_ProductSet.edit")
@UiDescriptor("product-set-edit.xml")
@EditedEntityContainer("productSetDc")
@LoadDataBeforeShow
public class ProductSetEdit extends StandardEditor<ProductSet> {

    @Inject
    private Table<TableOfContentsLink> tableOfContentsLinkListTable;
    @Inject
    private CollectionPropertyContainer<TableOfContentsLink> tableOfContentsLinkListDc;

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {
        int i = 0;
        // go through the data container items. The same can be done using getEditedEntity().getSingleActorList().
        for (TableOfContentsLink item : tableOfContentsLinkListDc.getItems()) {
            // set new value and add modified instance to the commit list
            item.setSort(i);
            event.getModifiedInstances().add(item);
            i += 10;
        }
    }

    @Subscribe("btnSortTable")
    public void onBtnSortTableClick(Button.ClickEvent event) {
        tableOfContentsLinkListTable.sort("sort", Table.SortDirection.ASCENDING);
    }
}