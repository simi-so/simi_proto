package ch.so.agi.simi.web.screens.singleactor;

import ch.so.agi.simi.entity.FacadeLayer;
import ch.so.agi.simi.entity.PostgresDS;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.simi.entity.SingleActor;
import com.haulmont.cuba.gui.screen.LookupComponent;

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

    @Inject
    private TextField<String> fldQuickFilter;

    @Inject
    private CollectionLoader<SingleActor> singleActorsDl;


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

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        singleActorsTable.sort("fullIdentifier", Table.SortDirection.ASCENDING);
    }

    @Subscribe("btnQuickFilter")
    public void onBtnQuickFilterClick(Button.ClickEvent event) {
        filterSingleActors();
    }

    @Subscribe("fldQuickFilter")
    public void onFldQuickFilterEnterPress(TextInputField.EnterPressEvent event) {
        filterSingleActors();
    }

    private void filterSingleActors(){

        boolean validWhereClause = false;
        String term = fldQuickFilter.getValue();

        if(term != null){
            term = term.trim();
            if(term.length() > 0) {
                validWhereClause = true;
                
                term = '%' + term + '%';
            }
        }

        if(validWhereClause){
            singleActorsDl.setParameter("term", term);
        }
        else {
            singleActorsDl.removeParameter("term");
        }

        singleActorsDl.load();
    }
}