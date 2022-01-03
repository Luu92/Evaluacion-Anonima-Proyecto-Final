package mx.edu.uacm.progweb.evaluacionanonima.conf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

	public static String NOMBRE_DB = "d8ojeo2fhoo1g7";
	public static String USUARIO = "jupxkpcbwrgtkh";
	public static String CONTRASENIA = "cd33dacba663b3f9c8c56049486ecda48c699182e7e9c96555eb8d614f78fcbb";
	public static String URL = "jdbc:postgresql://ec2-3-227-154-49.compute-1.amazonaws.com:5432/" + NOMBRE_DB;

	
	public static Connection conectarBaseDatos() throws SQLException {
		return DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
	}

	public static void close(ResultSet rs) throws SQLException {
		rs.close();
	}

	public static void close(Statement smtm) throws SQLException {
		smtm.close();
	}
	
	public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    } 

}
