package ch.so.agi.simi.web.screens.productset;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.ProductSet;

@UiController("simi_ProductSet.edit")
@UiDescriptor("product-set-edit.xml")
@EditedEntityContainer("productSetDc")
@LoadDataBeforeShow
public class ProductSetEdit extends StandardEditor<ProductSet> {
}