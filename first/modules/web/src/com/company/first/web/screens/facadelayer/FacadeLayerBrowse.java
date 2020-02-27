package com.company.first.web.screens.facadelayer;

import com.haulmont.cuba.gui.screen.*;
import com.company.first.entity.FacadeLayer;

@UiController("first_FacadeLayer.browse")
@UiDescriptor("facade-layer-browse.xml")
@LookupComponent("facadeLayersTable")
@LoadDataBeforeShow
public class FacadeLayerBrowse extends StandardLookup<FacadeLayer> {
}