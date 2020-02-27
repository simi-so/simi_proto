package com.company.first.web.screens.postgresds;

import com.haulmont.cuba.gui.screen.*;
import com.company.first.entity.PostgresDS;

@UiController("first_PostgresDS.browse")
@UiDescriptor("postgres-ds-browse.xml")
@LookupComponent("postgresDsesTable")
@LoadDataBeforeShow
public class PostgresDSBrowse extends StandardLookup<PostgresDS> {
}