package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class DépensesController implements Initializable

{
	
// Table View
    @FXML
    private TableView<Dep> TV;
  
    //Colum dans le Table View
    @FXML
    private TableColumn<Dep,String> VC;// Habillement

    @FXML
    private TableColumn<Dep, Double> SC; // Service
    
    @FXML
    private TableColumn<Dep, Double> NC;//Nourriture
    
    @FXML
    private TableColumn<Dep, Double> EC;//Extra
 
// Text Field
    @FXML
    private TextField SupText;//Extra

    @FXML
    private TextField Stext;//Service

    @FXML
    private TextField HText;//Habillement

    @FXML
    private TextField AText;//Nourriture

// Button
   
    @FXML
    private Button AB;

    @FXML
    private Button MB;

    @FXML
    private Button FB2;

    @FXML
    private Button EB;

    @FXML
    private Button RB;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//Attribuer les valeurs aux colones du TableView
		
	NC.setCellValueFactory(new PropertyValueFactory<>("Nourriture"));
	VC.setCellValueFactory(new PropertyValueFactory<>("Vêtements"));
	SC.setCellValueFactory(new PropertyValueFactory<>("Services"));
	EC.setCellValueFactory(new PropertyValueFactory<>("Extra"));
	
	showDepExtra(null);
	
	}
	//Pour effacer le contenu des champs
	
@FXML
void clearFields() {
	AText.setText("");
	HText.setText("");
	Stext.setText("");
	SupText.setText("");
}
	//Pour ajouter une nouvelle dépense 
	
@FXML
void ajouter()
{
	Dep tmp=new Dep();
	
	tmp=new Dep();
	tmp.setNC(Double.parseDouble(AText.getText()));
	tmp.setVC(Double.parseDouble(HText.getText()));
	tmp.setSC(Double.parseDouble(Stext.getText()));
	tmp.setEC(Double.parseDouble(SupText.getText()));
	clearFields();
}

// Pour afficher les depenses sur le tableau

@FXML
void showDepExtra(Dep dep) {
	if(dep !=null) {
		AText.setText(Double.toString(dep.getNC()));
		HText.setText(Double.toString(dep.getVC()));
		Stext.setText(Double.toString(dep.getSC()));
		SupText.setText(Double.toString(dep.getEC()));
	}
	else {
		clearFields();
	}
}

  


}
