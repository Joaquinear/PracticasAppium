package runner;

import activity.CreateNotesForm;
import activity.MainScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CreateNote {
    MainScreen mainScreen = new MainScreen();
    CreateNotesForm createNoteForm = new CreateNotesForm();
    @Given("que tengo abierto la app: whenDo")
    public void queTengoAbiertoLaAppWhenDo() {
    }

    @When("hago click en el boton [+]")
    public void hagoClickEnElBoton() {
        mainScreen.addNoteButton.click();
    }

    @And("ingreso el titulo: {string}")
    public void ingresoElTituloCatolica(String title) {
        createNoteForm.titleTxtBox.setText(title);
    }

    @And("ingreso la descripcion: {string}")
    public void ingresoLaDescripcionCatoDescription(String description) {
        createNoteForm.noteTxtBox.setText(description);
    }

    @And("hago click en boton [guardar]")
    public void hagoClickEnBotonGuardar() {
        createNoteForm.saveButton.click();
    }

    @Then("la nota {string} deberia ser creada")
    public void laNotaDeberiaSerCreada(String expectResult) {
        Assertions.assertTrue(mainScreen.isNoteDisplayed(expectResult),"ERROR, the note was not created");
    }
}
