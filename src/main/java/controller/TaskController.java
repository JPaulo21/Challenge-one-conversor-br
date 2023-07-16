package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import model.Moedas;

public class TaskController implements Initializable {

    @FXML
    private Button btnTrocar;

    @FXML
    private ChoiceBox<String> cbMoeda1;
    
    @FXML
    private ChoiceBox<String> cbMoeda2;

    @FXML
    private TextField txtValor1;

    @FXML
    private TextField txtValor2;
    
    private ObservableList<String> opcoesMoedas;
    
    public void inicializarDadosChoiceBox() {	
    	List<String> moedas = new ArrayList<String>();	
    	
    	for(Moedas e : Moedas.values()) {
    		moedas.add(e.getNome());
    	}
    	
    	opcoesMoedas = FXCollections.observableArrayList(moedas); 
    	cbMoeda1.setValue(Moedas.REAL.getNome());
    	cbMoeda1.setItems(opcoesMoedas);
    	cbMoeda2.setValue(Moedas.DOLAR.getNome());
    	cbMoeda2.setItems(opcoesMoedas);
    }
	
    @FXML
	void btnTrocar(ActionEvent event) {
		String valor = txtValor1.getText();
		txtValor1.setText(txtValor2.getText());
		txtValor2.setText(valor);
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		inicializarDadosChoiceBox();

	}

}
