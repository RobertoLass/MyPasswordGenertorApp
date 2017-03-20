package application;

/**
 * @author Roberto Lass
 * 
 * @TODO: Creating the GenertorClass is the next step
 * 
 * 
 * */
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class MyPassGenController implements Initializable {
	// The Label
	@FXML
	private Label lblOutput;
	
	@FXML
	private Label lblHeadline;
	
	// making the 3 Buttons accessible 
	@FXML
	private Button btnGenerate;
	
	@FXML
	private Button btnClose;
	
	@FXML
	private Button btnClear;
	
	// Making the Checkboxes visibile
	@FXML 
	private CheckBox chkatz;

	@FXML 
	private CheckBox chk0t9;
	
	@FXML 
	private CheckBox chkAtZ;
	
	@FXML
	private CheckBox chksz;
	
	@FXML
	private RadioButton rbeight;
	
	@FXML 
	private RadioButton rbtwelve;
	
	@FXML
	private RadioButton rbsixteen;
	
	@FXML
	private ToggleGroup groupe;
	
	
	
	public void generating(ActionEvent event){
		
		System.out.println("Button Pressed"+btnGenerate.getText());
		//
		String t = "Test Ausgabe des Passworts!";
		lblOutput.setText(t);
	}
	
	public void clearing(ActionEvent event){
		lblOutput.setText("");
		System.out.println("Button Pressed"+btnClear.getText());
	}
	
	public void closing(ActionEvent event){
		System.out.println("Button Pressed"+btnClose.getText());
		Stage stage = (Stage)btnClose.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {


	}

}
