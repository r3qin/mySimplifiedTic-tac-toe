import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import java.awt.*;

public class square extends StackPane{
	
	private Button mybutton = null;
	private boolean ch;
	
	public square() {
		mybutton = new Button();
		mybutton.setMinSize(200, 200);
		this.getChildren().add(mybutton);
		ch = false;
	}
	
	public Button getButton() {
		return mybutton;
	}
	
	public void setCh() {
        ch = true;
    }

    public boolean getCh() {
	    return ch;
    }
}