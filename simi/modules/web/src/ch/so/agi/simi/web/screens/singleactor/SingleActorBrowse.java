package ch.so.agi.simi.web.screens.singleactor;

import ch.so.agi.simi.entity.FacadeLayer;
import ch.so.agi.simi.entity.PostgresDS;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.PopupButton;
import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.SingleActor;

import javax.inject.Inject;

@UiController("simi_SingleActor.browse")
@UiDescriptor("single-actor-browse.xml")
@LookupComponent("singleActorsTable")
@LoadDataBeforeShow
public class SingleActorBrowse extends StandardLookup<SingleActor> {

    @Inject
    private ScreenBuilders screenBuilders;

    @Inject
    private GroupTable<SingleActor> singleActorsTable;

    @Inject
    private Metadata metadata;


    @Subscribe("createFlBtn")
    public void onCreateFlBtnClick(Button.ClickEvent event) {
        FacadeLayer fl = metadata.create(FacadeLayer.class);
        showCreateEditorForSingleActor(fl);
    }

    @Subscribe("createPdsBtn")
    public void onCreatePdsBtnClick(Button.ClickEvent event) {
        PostgresDS pds = metadata.create(PostgresDS.class);
        showCreateEditorForSingleActor(pds);
    }

    private void showCreateEditorForSingleActor(SingleActor sa) {
        screenBuilders.editor(singleActorsTable)
                .editEntity(sa)
                .build()
                .show();
    }
    
    
}