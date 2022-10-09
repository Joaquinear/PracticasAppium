package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class DeleteNotes {
    //para verificar que podemos hacer delete y para borrar
    public Button delete = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    //Para el assertion
    public Label titleDeleteNote = new Label(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public boolean isNoteDisplayed(){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='Confirm Delete']"));
        return note.isControlDisplayed();
    }

    public Button deleteConfirm = new Button(By.id("android:id/button1"));
    public DeleteNotes(){}

}
