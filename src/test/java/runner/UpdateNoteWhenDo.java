package runner;

import activity.CreateNotesForm;
import activity.MainScreen;
import activity.UpdateNotes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class UpdateNoteWhenDo {
    String tituloOld;
    String tituloNew;
    String descriptionOld;
    String descriptionNew;
    MainScreen mainScreen = new MainScreen();
    CreateNotesForm createNoteForm = new CreateNotesForm();
    UpdateNotes updateNotes = new UpdateNotes();
    @And("presiona sobre el titulo de la tarea {string}")
    public void presionaSobreElTituloDeLaTarea(String title) {
        this.tituloOld = title;
        Assertions.assertEquals(updateNotes.tituloBox.getText(),title);
        updateNotes.tituloBox.click();
    }

    @And("modifica el titulo por {string}")
    public void modificaElTituloPor(String newTitle) {
        this.tituloNew = newTitle;
        updateNotes.tituloBox.setText(newTitle);
    }

    @And("presiona sobre la descripcion")
    public void presionaSobreLaDescripcion() {
        this.descriptionOld = updateNotes.noteBox.getText();
        updateNotes.noteBox.click();
    }

    @And("modifica la descripcion por {string}")
    public void modificaLaDescripcionPor(String newDescription) {
        this.descriptionNew = newDescription;
        updateNotes.noteBox.setText(newDescription);
    }
// EL PASO DE VOLVER A GUARDAR ESTA EN EL CREATE(esto es modificacion)
    @Then("el titulo, descripcion fueron modificados")
    public void elTituloDescripcionFueronModificados() {
            Assertions.assertTrue(updateNotes.wasUpdate(tituloNew));
            Assertions.assertTrue(updateNotes.wasUpdate(descriptionNew));
    }


}
