package ch.so.agi.simi.web.screens.datasetlistproperties;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.DatasetListProperties;

@UiController("simi_DatasetListProperties.edit")
@UiDescriptor("dataset-list-properties-edit.xml")
@EditedEntityContainer("datasetListPropertiesDc")
@LoadDataBeforeShow
public class DatasetListPropertiesEdit extends StandardEditor<DatasetListProperties> {
}