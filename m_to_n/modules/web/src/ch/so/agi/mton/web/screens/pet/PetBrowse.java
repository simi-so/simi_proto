package ch.so.agi.mton.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.mton.entity.Pet;

@UiController("mton_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
@LoadDataBeforeShow
public class PetBrowse extends StandardLookup<Pet> {
}