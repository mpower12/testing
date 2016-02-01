package stackpanetest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class WindowController implements Initializable {

	
	StackController stackController;
	public Scene scene;
	Stage stage;
	@FXML Pane pane;
	
	
	public WindowController(StackController stackController, String GUI){
	this.stackController = stackController;
	
	try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(GUI));
		//loader.setRoot(this);
		loader.setController(this);
		loader.load();

	} catch(Exception e) {
		e.printStackTrace();
	}
	scene = new Scene(pane);
	stage = new Stage();
	stage.setScene(scene);
	
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	public void changeWindow(){
		//stackController.stack.getChildren().get(1).toBack();
		stackController.popup.stage.show();
	}

}
