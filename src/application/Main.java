package application;
	
/**
 * @author Roberto Lass
 * */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("guo.fxml"));  // loading the external FXML File
			primaryStage.setTitle("MyPassword-Generator"); // title Defining
			primaryStage.setScene(new Scene(root)); 	   // setting up the root in the scene
			primaryStage.show();    // print it out on the screen
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
