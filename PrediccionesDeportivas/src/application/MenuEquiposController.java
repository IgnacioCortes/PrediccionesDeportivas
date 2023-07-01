package application;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MenuEquiposController implements Initializable{
	@FXML
	private HBox left_pane;
	
	@FXML
	private HBox main_pain;
		
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	private DataBaseManager dataBaseManager = new DataBaseManager();
	
	private HashMap<String, Equipo> equipos = new HashMap<String, Equipo>();
	
	public void initialize(URL url, ResourceBundle rb) {
		
		try {
			dataBaseManager.connect();
			equipos = obtenerEquipos();	
		
		} catch(SQLException e) {
			
		}
	}
	
	public void switchToEquipoScene(ActionEvent event) throws IOException {
		
		root = FXMLLoader.load(getClass().getResource("view/Equipo.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root, 1080, 600);
		stage.setScene(scene);
		stage.show();

	}
	
	public HashMap<String, Equipo> obtenerEquipos() {
		HashMap<String, Equipo> equiposMap = new HashMap<>();
	    try {
	        ResultSet resultSet = dataBaseManager.executeQuery("SELECT * FROM equipos ORDER BY Nombre");
	        
	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String nombre = resultSet.getString("nombre");
	            int puntos = resultSet.getInt("puntos");
	            int rendimiento = resultSet.getInt("rendimiento");
	            System.out.println("ID: "+ id + "Equipo: " + nombre + ", Puntos: " + puntos);
	            
	            Equipo equipoAux = new Equipo(id, nombre, rendimiento, puntos);
	            equiposMap.put(nombre, equipoAux);
	            
	        }
	        
	        resultSet.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return equiposMap;
	    
	}
	
	
	
}
