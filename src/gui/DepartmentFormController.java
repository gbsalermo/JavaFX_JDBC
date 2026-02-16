package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable{
	
	private Department entity; //Dependencia do department

	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBtSaveAction");
	}
	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtSaveAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId); //Põe a regra de apenas numeros inteiros no ID
		Constraints.setTextFieldMaxLength(txtName, 30); //Põe a limitação de 30 caracteres pro name
	}
	
	public void updateFormData() {
		
		if (entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		txtId.setText(String.valueOf(entity.getId())); //Aqui converto o valor para String
		txtName.setText(entity.getName());
	}

}
