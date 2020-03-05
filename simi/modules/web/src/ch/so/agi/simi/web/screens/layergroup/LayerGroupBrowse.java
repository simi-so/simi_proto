package ch.so.agi.simi.web.screens.layergroup;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.LayerGroup;

@UiController("simi_LayerGroup.browse")
@UiDescriptor("layer-group-browse.xml")
@LookupComponent("layerGroupsTable")
@LoadDataBeforeShow
public class LayerGroupBrowse extends StandardLookup<LayerGroup> {
}