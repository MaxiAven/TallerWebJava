package ar.edu.grupoesfera.cursospring.conexionDb;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ConexionDb {
	
	private static final Logger LOG = LoggerFactory.getLogger(ConexionDb.class);

	@SuppressWarnings("finally")
	public static Connection GetConnection() {
		Connection conexion = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost:3306/bar";
			String usuarioDB = "root";
			String passwordDB = "rootroot";
			conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
		}

		catch (Exception ex) {
			LOG.error("Error en la conexion con la DB " + ex.getMessage());
			conexion = null;
		}

		finally {
			return conexion;
		}
	}

}
