package stackpanetest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackController implements Initializable{

	Stage stage;
	StackPane stack;
	public PopupController popup;
	public WindowController window1, window2;
	public StackController(Stage primaryStage){
		stage = primaryStage;
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		window1 = new WindowController(this,"/stackpanetest/Window1.fxml");
		window2 = new WindowController(this,"/stackpanetest/Window2.fxml");
		popup = new PopupController(this);
		//stack.getChildren().add(window1.pane);
		//stack.getChildren().add(window2.pane);
		//stage.setScene(window1.scene);
		
	}
	public void setPane(StackPane pane){
		stack = pane;
		System.out.println(pane);
		System.out.println(stack);
		if(stack == null){
			System.out.println("is null");
		}
		stack.getChildren().add(window1.pane);
		stack.getChildren().add(window2.pane);
		
		
	}
}
