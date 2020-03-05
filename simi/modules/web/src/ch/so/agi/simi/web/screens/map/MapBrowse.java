package ch.so.agi.simi.web.screens.map;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.Map;

@UiController("simi_Map.browse")
@UiDescriptor("map-browse.xml")
@LookupComponent("mapsTable")
@LoadDataBeforeShow
public class MapBrowse extends StandardLookup<Map> {
}