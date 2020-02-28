package ch.so.agi.simi.web.screens.propertiesinlist;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.PropertiesInList;

@UiController("simi_PropertiesInList.edit")
@UiDescriptor("properties-in-list-edit.xml")
@EditedEntityContainer("propertiesInListDc")
@LoadDataBeforeShow
public class PropertiesInListEdit extends StandardEditor<PropertiesInList> {
}