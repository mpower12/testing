package stackpanetest;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	//@FXML StackPane pane;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackController controller = new StackController(primaryStage);
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/stackpanetest/StackWindow.fxml"));
			loader.setController(controller);
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			
			StackPane root = (StackPane)loader.load();
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setFullScreen(true);
			System.out.println(root);
			controller.setPane(root);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
