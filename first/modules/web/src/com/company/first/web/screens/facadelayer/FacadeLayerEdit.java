package com.company.first.web.screens.facadelayer;

import com.company.first.entity.PostgresDS;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.first.entity.FacadeLayer;

import javax.inject.Inject;

@UiController("first_FacadeLayer.edit")
@UiDescriptor("facade-layer-edit.xml")
@EditedEntityContainer("facadeLayerDc")
public class FacadeLayerEdit extends StandardEditor<FacadeLayer> {
    @Inject
    private CollectionLoader<PostgresDS> postgresDsesDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        postgresDsesDl.setParameter("facadeLayer", getEditedEntity());
        getScreenData().loadAll();
    }


}