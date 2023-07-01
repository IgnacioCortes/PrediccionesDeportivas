package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager {
    private static final String DATABASE_URL = "jdbc:sqlite:C://Users/ignac/eclipse-workspace/NUEVO ECLIPSE/PrediccionesDeportivas/src/application/DB.db";
    
    private Connection connection;

    public DataBaseManager() {
        // Constructor
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(DATABASE_URL);
        System.out.println("Connected to database");
    }

    public void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("Disconnected from database");
        }
    }

    public ResultSet executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }
    
    // Otros métodos para ejecutar consultas de actualización (INSERT, UPDATE, DELETE)
}