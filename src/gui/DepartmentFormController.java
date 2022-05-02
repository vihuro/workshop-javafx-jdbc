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

public class DepartmentFormController implements Initializable {
	
	private Department entity;
	
	
	
	@FXML
	private TextField txtid;
	
	@FXML
	private TextField txtname;
	
	@FXML
	private Label labelError;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	@FXML
	public void onbtSaveAction() {
		System.out.println("Botão Salvar funcionando");
	}
	
	@FXML
	public void onbtCancelAction() {
		System.out.println("Botão Cancelar funcionando");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtid);

		}
	
	public void updateFormData() {
		txtid.setText(String.valueOf(entity.getId()));
		txtname.setText(entity.getName());
	}
	

}
