package ch.so.agi.simi.web.screens.tableofcontentslink;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.TableOfContentsLink;

@UiController("simi_TableOfContentsLink.edit")
@UiDescriptor("table-of-contents-link-edit.xml")
@EditedEntityContainer("tableOfContentsLinkDc")
@LoadDataBeforeShow
public class TableOfContentsLinkEdit extends StandardEditor<TableOfContentsLink> {
}