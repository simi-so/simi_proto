package ch.so.agi.mton.web.screens.pet;

import com.haulmont.cuba.gui.screen.*;
import ch.so.agi.mton.entity.Pet;

@UiController("mton_Pet.edit")
@UiDescriptor("pet-edit.xml")
@EditedEntityContainer("petDc")
@LoadDataBeforeShow
public class PetEdit extends StandardEditor<Pet> {
}