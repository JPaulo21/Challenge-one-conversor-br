package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class TaskController implements Initializable {

    @FXML
    private Button btnTrocar;

    @FXML
    private ChoiceBox<?> moeda1;

    @FXML
    private TextField txtValor1;

    @FXML
    private TextField txtValor2;
	
    @FXML
	void btnTrocar(ActionEvent event) {
		String valor = txtValor1.getText();
		txtValor1.setText(txtValor2.getText());
		txtValor2.setText(valor);   	
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
