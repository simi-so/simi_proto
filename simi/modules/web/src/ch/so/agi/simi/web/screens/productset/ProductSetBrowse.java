package ch.so.agi.simi.web.screens.productset;

import ch.so.agi.simi.entity.*;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("simi_ProductSet.browse")
@UiDescriptor("product-set-browse.xml")
@LookupComponent("productSetsTable")
@LoadDataBeforeShow
public class ProductSetBrowse extends StandardLookup<ProductSet> {

    @Inject
    private ScreenBuilders screenBuilders;

    @Inject
    private GroupTable<ProductSet> productSetsTable;

    @Inject
    private Metadata metadata;

/*
    @Subscribe("createLgBtn")
    public void onCreateLgBtnClick(Button.ClickEvent event) {
        LayerGroup lg = metadata.create(LayerGroup.class);
        showCreateEditorForProductSet(lg);
    }

    @Subscribe("createMapBtn")
    public void onCreateMapBtnClick(Button.ClickEvent event) {
        Map map = metadata.create(Map.class);
        showCreateEditorForProductSet(map);
    }

    private void showCreateEditorForProductSet(ProductSet ps) {
        screenBuilders.editor(productSetsTable)
                .editEntity(ps)
                .build()
                .show();
    }
 */
}