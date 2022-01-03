package mx.edu.uacm.progweb.evaluacionanonima.conf.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;


public class ConexionDBTest {
	
	@Test
	public void debeObtenerConexionaDB() throws SQLException {
		System.out.println("> Entrando al metodo: debeObtenerConexionaDB()");
		Connection con = ConexionDB.conectarBaseDatos();
		//Afirma que la conección no es NULL
		assertNotNull(con);
	}
	
}
