package activity;

import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class UpdateNotes {
    public TextBox tituloBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public boolean wasUpdate(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }
    public UpdateNotes(){}
}
