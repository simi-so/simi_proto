package ch.so.agi.simi.web.screens.facadelayer;

import ch.so.agi.simi.entity.DatasetListProperties;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.FacadeLayer;

import javax.inject.Inject;

@UiController("simi_FacadeLayer.edit")
@UiDescriptor("facade-layer-edit.xml")
@EditedEntityContainer("facadeLayerDc")
@LoadDataBeforeShow
public class FacadeLayerEdit extends StandardEditor<FacadeLayer> {
    @Inject
    private CollectionPropertyContainer<DatasetListProperties> dataSetListPropertiesDc;
    @Inject
    private Table<DatasetListProperties> dataSetListPropertiesTable;

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {
        int i = 0;
        // go through the data container items. The same can be done using getEditedEntity().getSingleActorList().
        for (DatasetListProperties item : dataSetListPropertiesDc.getItems()) {
            // set new value and add modified instance to the commit list
            item.setSort(i);
            event.getModifiedInstances().add(item);
            i += 10;
        }
    }

    @Subscribe("btnSortTable")
    public void onBtnSortTableClick(Button.ClickEvent event) {
        dataSetListPropertiesTable.sort("sort", Table.SortDirection.ASCENDING);
    }
}