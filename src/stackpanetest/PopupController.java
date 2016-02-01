package stackpanetest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PopupController implements Initializable{

	StackController stackController;
	Stage stage;
	Scene scene;
	@FXML Pane pane;
	
	public PopupController(StackController stackController){
		this.stackController = stackController;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/stackpanetest/Window1.fxml"));
			//loader.setRoot(this);
			loader.setController(this);
			loader.load();

		} catch(Exception e) {
			e.printStackTrace();
		}
	
		scene = new Scene(pane);
		stage = new Stage();
		stage.initOwner(stackController.stage);
		stage.setScene(scene);
		//stage.initStyle(StageStyle.TRANSPARENT);
	}
	
	public void show(){
		stage.show();
	}
	@FXML
	public void changeWindow(){
		stage.setX(0);
		stage.setY(0);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
