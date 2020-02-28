package ch.so.agi.simi.web.screens.productset;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.ProductSet;

@UiController("simi_ProductSet.browse")
@UiDescriptor("product-set-browse.xml")
@LookupComponent("productSetsTable")
@LoadDataBeforeShow
public class ProductSetBrowse extends StandardLookup<ProductSet> {
}