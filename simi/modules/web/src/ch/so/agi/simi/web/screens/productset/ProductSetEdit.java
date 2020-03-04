package ch.so.agi.simi.web.screens.productset;

import ch.so.agi.simi.entity.SingleActorListProperties;
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
    private Table<SingleActorListProperties> singleActorListTable;
    @Inject
    private CollectionPropertyContainer<SingleActorListProperties> singleActorListDc;

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {
        int i = 0;
        // go through the data container items. The same can be done using getEditedEntity().getSingleActorList().
        for (SingleActorListProperties item : singleActorListDc.getItems()) {
            // set new value and add modified instance to the commit list
            item.setSort(i);
            event.getModifiedInstances().add(item);
            i += 10;
        }
    }

    @Subscribe("btnSortTable")
    public void onBtnSortTableClick(Button.ClickEvent event) {
        singleActorListTable.sort("sort", Table.SortDirection.ASCENDING);
    }
}