package ch.so.agi.simi.web.screens.map;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.Map;

@UiController("simi_Map.edit")
@UiDescriptor("map-edit.xml")
@EditedEntityContainer("mapDc")
@LoadDataBeforeShow
public class MapEdit extends StandardEditor<Map> {
}