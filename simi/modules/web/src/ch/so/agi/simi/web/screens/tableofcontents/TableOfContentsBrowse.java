package ch.so.agi.simi.web.screens.tableofcontents;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.TableOfContents;

@UiController("simi_TableOfContents.browse")
@UiDescriptor("table-of-contents-browse.xml")
@LookupComponent("tableOfContentsesTable")
@LoadDataBeforeShow
public class TableOfContentsBrowse extends StandardLookup<TableOfContents> {
}