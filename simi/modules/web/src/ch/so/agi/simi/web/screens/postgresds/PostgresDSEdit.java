package ch.so.agi.simi.web.screens.postgresds;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.PostgresDS;

@UiController("simi_PostgresDS.edit")
@UiDescriptor("postgres-ds-edit.xml")
@EditedEntityContainer("postgresDSDc")
@LoadDataBeforeShow
public class PostgresDSEdit extends StandardEditor<PostgresDS> {
}