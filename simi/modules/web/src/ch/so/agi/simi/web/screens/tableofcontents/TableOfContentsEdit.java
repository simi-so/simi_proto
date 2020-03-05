package ch.so.agi.simi.web.screens.tableofcontents;

import ch.so.agi.simi.entity.SingleActorListProperties;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.TableOfContents;

import javax.inject.Inject;

@UiController("simi_TableOfContents.edit")
@UiDescriptor("table-of-contents-edit.xml")
@EditedEntityContainer("tableOfContentsDc")
@LoadDataBeforeShow
public class TableOfContentsEdit extends StandardEditor<TableOfContents> {

    @Inject
    private Table<SingleActorListProperties> singleActorListPropertiesTable;
    @Inject
    private CollectionPropertyContainer<SingleActorListProperties> singleActorListPropertiesDc;

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {
        int i = 0;
        // go through the data container items. The same can be done using getEditedEntity().getSingleActorList().
        for (SingleActorListProperties item : singleActorListPropertiesDc.getItems()) {
            // set new value and add modified instance to the commit list
            item.setSort(i);
            event.getModifiedInstances().add(item);
            i += 10;
        }
    }

    @Subscribe("btnSortTable")
    public void onBtnSortTableClick(Button.ClickEvent event) {
        singleActorListPropertiesTable.sort("sort", Table.SortDirection.ASCENDING);
    }
}