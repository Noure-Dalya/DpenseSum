package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DépensesController {
	
// Table View
    @FXML
    private TableView<Dep> TV;
  
    //Colum dans le Table View
    @FXML
    private TableColumn<Dep,String> VC;

    @FXML
    private TableColumn<Dep, Double> SC;
    
    @FXML
    private TableColumn<Dep, Double> NC;
    
    @FXML
    private TableColumn<Dep, Double> EC;
 
// Text Field
    @FXML
    private TextField SupText;

    @FXML
    private TextField Stext;

    @FXML
    private TextField HText;

    @FXML
    private TextField AText;

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


  


}
