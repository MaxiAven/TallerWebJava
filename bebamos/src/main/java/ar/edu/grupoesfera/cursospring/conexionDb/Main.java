package ar.edu.grupoesfera.cursospring.conexionDb;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) {

		Connection miConexion = ConexionDb.GetConnection();

		if (miConexion != null) {
			System.out.println("Conexión Realizada Correctamente");
				
		}
		
	}
}
