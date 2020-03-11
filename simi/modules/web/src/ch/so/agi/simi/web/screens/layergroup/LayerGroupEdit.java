package ch.so.agi.simi.web.screens.layergroup;

import ch.so.agi.simi.entity.LayerGroup;
import ch.so.agi.simi.entity.TableOfContents;
import ch.so.agi.simi.entity.TableOfContentsLink;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.UUID;

@UiController("simi_LayerGroup.edit")
@UiDescriptor("layer-group-edit.xml")
@EditedEntityContainer("layerGroupDc")
public class LayerGroupEdit extends StandardEditor<LayerGroup> {

    @Inject
    private InstanceLoader<LayerGroup> layerGroupDl;
    @Inject
    private DataManager dataManager;
    @Inject
    private DataContext dataContext;
    @Inject
    private InstanceContainer<TableOfContents> tableOfContentsDc;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        assertJoinedOverTOC();
    }

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {
        setTocIdentToLGIdent();
    }

    private void assertJoinedOverTOC(){
        layerGroupDl.load(); // first load the edited entity

        LayerGroup layerGroup = getEditedEntity();

        // load or create a linked TableOfContentsLink
        TableOfContentsLink tocLink = dataManager.load(TableOfContentsLink.class)
                .query("select tocl from simi_TableOfContentsLink tocl where tocl.productset = :productSet")
                .parameter("productSet", layerGroup)
                .view("toclink-layergroup-edit") // using view that defines link to TableOfContents and deeper to SingleActorListProperties and SingleActor
                .optional()
                .orElseGet(() -> {
                    TableOfContentsLink newTocLink = dataContext.create(TableOfContentsLink.class);
                    newTocLink.setProductset(layerGroup);
                    return newTocLink;
                });

        // get or create a linked TableOfContents
        TableOfContents toc = tocLink.getTableOfContents();
        if (toc == null) {
            toc = dataContext.create(TableOfContents.class);
            toc.setSingleActorListProperties(new ArrayList<>());
            tocLink.setTableOfContents(toc);
        }

        // set the TableOfContents to its data container
        tableOfContentsDc.setItem(toc);
    }

    private void setTocIdentToLGIdent() {
        LayerGroup layerGroup = getEditedEntity();
        TableOfContents toc = tableOfContentsDc.getItem();

        toc.setIdentifier(layerGroup.getIdentifier());
    }
}