package application;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EquipoController implements Initializable{

	@FXML
	private HBox left_pane;
	@FXML
	private HBox main_pain;
	@FXML
	private Label lblNombreEquipo;
	@FXML
	private Label lblRendimiento;
	@FXML
	private Label lblPuntos;
	@FXML
	private Label lblPosesion;
	@FXML
	private Label lblOcasionClara;
	@FXML
	private Label lblOcasionClaraFallada;
	@FXML
	private Label lblOcasionContraAtaque;
	@FXML
	private Label lblSaqueDeEsquina;
	@FXML
	private Label lblTiroContraAtaque;
	@FXML
	private Label lblTiroEnElArea;
	@FXML
	private Label lblTiroFueraDelArea;
	@FXML
	private Label lblAtajadaRival;
	@FXML
	private Label lblAtajadaRivalEnElArea;
	
	
	
	
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;
	

	
	public void initialize(URL url, ResourceBundle rb) {
		
		Equipo e = new Equipo(1, "Colo Colo", 50, 50, 12, 56, 76, 43, 32, 11, 2, 3, 45, 3);
		lblNombreEquipo.setText(e.getNombre());
		lblRendimiento.setText(Integer.toString(e.getRendimiento()));
		lblPuntos.setText(Integer.toString(e.getPuntos()));
		lblPosesion.setText(Integer.toString(e.getPosesion()));
		lblOcasionClara.setText(Integer.toString(e.getOcasionClara()));
		lblOcasionClaraFallada.setText(Integer.toString(e.getOcasionClaraFallada()));
		lblOcasionContraAtaque.setText(Integer.toString(e.getOcasionContraAtaque()));
		lblSaqueDeEsquina.setText(Integer.toString(e.getSaqueDeEsquina()));
		lblTiroContraAtaque.setText(Integer.toString(e.getTiroContrataque()));
		lblTiroFueraDelArea.setText(Integer.toString(e.getTiroFueraDelArea()));
		lblAtajadaRival.setText(Integer.toString(e.getAtajadaRival()));
		lblAtajadaRivalEnElArea.setText(Integer.toString(e.getAtajadaRivalEnElArea()));
		
		
	}
	//CAMBIO DE ESCENA
	public void switchToEquipos(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("view/MenuEquipos.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root, 1080, 600);
		stage.setScene(scene);
		stage.show();	
	}	
}

