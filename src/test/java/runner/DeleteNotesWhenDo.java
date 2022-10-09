package runner;

import activity.CreateNotesForm;
import activity.DeleteNotes;
import activity.MainScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class DeleteNotesWhenDo {
    String titleNote;
    MainScreen mainScreen = new MainScreen();
    CreateNotesForm createNoteForm = new CreateNotesForm();
    DeleteNotes deleteNotes = new DeleteNotes();
    @And("usuario selecciona el item guardado con titulo {string}")
    public void usuarioSeleccionaElItemGuardadoConTitulo(String titulo) {
        this.titleNote = titulo;
        mainScreen.selectItem(titulo);
    }

    @And("la aplicacion muestra los datos de la tarea")
    public void laAplicacionMuestraLosDatosDeLaTarea() {
        Assertions.assertEquals(titleNote,deleteNotes.titleDeleteNote.getText());
    }

    @And("usuario presiona sobre el logo del [BASURERO]")
    public void usuarioPresionaSobreElLogoDelBASURERO() {
        deleteNotes.delete.click();
    }

    @And("aparece mensaje de confirmacion")
    public void apareceMensajeDeConfirmacion() {
        Assertions.assertTrue(deleteNotes.isNoteDisplayed());
    }

    @And("usuario presiona en [DELETE]")
    public void usuarioPresionaEnDELETE() {
        deleteNotes.deleteConfirm.click();
    }

    @Then("la nota seleccionada es eliminada")
    public void laNotaSeleccionadaEsEliminada() {
        Assertions.assertFalse(mainScreen.isNoteDisplayed(titleNote));
    }
}
