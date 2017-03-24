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
		// Which is Selected, fill in a Boolean and give them down to the Generator to check it
		boolean cbaz = chkatz.isSelected();
		boolean cbAZ = chkAtZ.isSelected();
		boolean cb09 = chk0t9.isSelected();
		boolean cbsz = chksz.isSelected();		
		boolean rb8 = rbeight.isSelected();
		boolean rb16 =rbsixteen.isSelected();
		boolean rb12= rbtwelve.isSelected();
		
		String t = TheGenerator.produce(cbaz,cbAZ,cb09,cbsz,rb8,rb12,rb16).toString();	
		System.out.println(t);
		lblOutput.setText(t);
	}
	
	public void clearing(ActionEvent event){
		lblOutput.setText(""); // Blank the Label
		System.out.println("Button Pressed"+btnClear.getText());
	}
	
	public void closing(ActionEvent event){
		// Closing the Stuff
		System.out.println("Button Pressed"+btnClose.getText());
		Stage stage = (Stage)btnClose.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {


	}

}
