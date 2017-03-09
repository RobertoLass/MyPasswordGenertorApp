package application;

/**
 * @author Roberto Lass
 * 
 * @TODO: A Lot of Stuff
 * */
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MyPassGenController implements Initializable {
	// The Lanel
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
	
	public MyPassGenController() {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {


	}

}
