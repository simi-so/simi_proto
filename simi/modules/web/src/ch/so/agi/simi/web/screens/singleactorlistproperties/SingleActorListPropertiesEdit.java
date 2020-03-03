package ch.so.agi.simi.web.screens.singleactorlistproperties;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.SingleActorListProperties;

@UiController("simi_SingleActorListProperties.edit")
@UiDescriptor("single-actor-list-properties-edit.xml")
@EditedEntityContainer("singleActorListPropertiesDc")
@LoadDataBeforeShow
public class SingleActorListPropertiesEdit extends StandardEditor<SingleActorListProperties> {
}