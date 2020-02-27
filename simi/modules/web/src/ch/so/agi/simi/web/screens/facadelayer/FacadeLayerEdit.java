package ch.so.agi.simi.web.screens.facadelayer;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.FacadeLayer;

@UiController("simi_FacadeLayer.edit")
@UiDescriptor("facade-layer-edit.xml")
@EditedEntityContainer("facadeLayerDc")
@LoadDataBeforeShow
public class FacadeLayerEdit extends StandardEditor<FacadeLayer> {
}