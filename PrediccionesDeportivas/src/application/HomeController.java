package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;


public class HomeController implements Initializable {
	
	/*HOLA MUNDO
 	@FXML
	private Label labMensaje;

	// Event Listener on Button.onAction
	@FXML
	public void btnPresionado(ActionEvent event) {
		// TODO Autogenerated
		labMensaje.setText("Predicciones Deportivas");
	}
	//FIN HOLA MUNDO
	*/
	
	@FXML
	private TableView<Equipo> productTableView;

	@FXML
	private TableColumn<Equipo, String> equipoTableColumn;
	
	@FXML
	private TableColumn<Equipo, Integer> idTableColumn;
	
	@FXML
	private TableColumn<Equipo, Integer> rendimientoTableColumn;
	
	@FXML
	private TableColumn<Equipo, Integer> puntosTableColumn;
	
	
	ObservableList<Equipo> equipoObservableList = FXCollections.observableArrayList();
	
	
	@Override
	public void initialize(URL url, ResourceBundle resource) {
		idTableColumn.setCellValueFactory(new PropertyValueFactory<Equipo, Integer>("id"));
		equipoTableColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("nombre"));
		rendimientoTableColumn.setCellValueFactory(new PropertyValueFactory<Equipo, Integer>("rendimiento"));
		puntosTableColumn.setCellValueFactory(new PropertyValueFactory<Equipo, Integer>("puntos"));
		
		Equipo e = new Equipo(20, "PRUEBA", 100, 100);
		
		
		equipoObservableList.add(new Equipo(1, "Cobresal", 5, 28));
		equipoObservableList.add(new Equipo(2, "Huachipato", 5, 28));
		equipoObservableList.add(new Equipo(3, "Universidad de Chile", 5, 26));
		equipoObservableList.add(new Equipo(4, "Coquimbo Unido", 5, 25));
		equipoObservableList.add(new Equipo(5, "Universidad Catolica", 5, 23));
		equipoObservableList.add(new Equipo(6, "Colo-Colo", 5, 23));
		equipoObservableList.add(new Equipo(7, "Everton", 5, 22));
		equipoObservableList.add(new Equipo(8, "Union Española", 5, 21));
		equipoObservableList.add(new Equipo(9, "O'Higgins", 5, 20));
		equipoObservableList.add(new Equipo(10, "Audax Italiano", 5,19));
		equipoObservableList.add(new Equipo(11, "Palestino", 5, 19));
		equipoObservableList.add(new Equipo(12, "Ñublense", 5, 18));
		equipoObservableList.add(new Equipo(13, "Union La Calera", 5, 17));
		equipoObservableList.add(new Equipo(14, "Curico Unido", 5, 16));
		equipoObservableList.add(new Equipo(15, "Deportes Copiapo", 5, 13));
		equipoObservableList.add(new Equipo(16, "Magallanes", 5, 8));
		
		equipoObservableList.add(e);
		
		
		productTableView.setItems(equipoObservableList);
		
		
		/*
		equipoObservableList = FXCollections.observableArrayList();
		
		idTableColumn.setCellValueFactory(new PropertyValueFactory<Equipo, Integer>("id"));
		equipoTableColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("nombre"));
		
		equipoObservableList.add(new Equipo(1, "Colo Colo"));
		equipoObservableList.add(new Equipo(2, "Curico Unido"));
		*/
		
		
		
		
		
		
		
		
		
	
	
		
	}
	
	
	
	
	
	
	
}