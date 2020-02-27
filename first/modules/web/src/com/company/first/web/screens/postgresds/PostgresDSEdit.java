package com.company.first.web.screens.postgresds;

import com.haulmont.cuba.gui.screen.*;
import com.company.first.entity.PostgresDS;

@UiController("first_PostgresDS.edit")
@UiDescriptor("postgres-ds-edit.xml")
@EditedEntityContainer("postgresDSDc")
@LoadDataBeforeShow
public class PostgresDSEdit extends StandardEditor<PostgresDS> {
}