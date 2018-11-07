import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import java.beans.*;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.awt.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class myLittleGame extends Application {
	
	private int check;
	
	public void start(Stage mainStage) {
		Scene sc = null;
		GridPane gp = null;
		Insets pad = null;
		Label symbol = null;
		
		gp = new GridPane();
		sc = new Scene(gp);
		
		check = 1;
		
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j) {
				square mys = new square();
				mys.getButton().setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent ev) {
						Label symbol = new Label();
						if(check % 2 == 1 && mys.getCh() == false) {
							symbol.setText("X");
							symbol.setFont(Font.font("Shrikhand", FontWeight.BOLD, 100));
							//symbol.setTextFill(Color.BLUE);
							mys.getChildren().add(symbol);
							mys.setCh();
							check++;
						}
						else if(check % 2 == 0 && mys.getCh() == false){
							symbol.setText("O");
							symbol.setFont(Font.font("Shrikhand", FontWeight.BOLD, 100));
							//symbol.setTextFill(Color.BLUE);
							mys.getChildren().add(symbol);
							mys.setCh();
							check++;
						}
					}
				});
				gp.add(mys, j, i);
			}
		}
		
		pad = new Insets(10, 10, 10, 10);
		gp.setPadding(pad);
		gp.setHgap(5);
		gp.setVgap(5);
		
		mainStage.setScene(sc);
		mainStage.setTitle("Little Game");
		mainStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}