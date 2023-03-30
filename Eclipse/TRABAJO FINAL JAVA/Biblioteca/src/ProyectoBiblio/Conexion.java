package ProyectoBiblio;

import java.sql.*;

public class Conexion {
	Connection con;
	
	private String DRIVER = "com.mysql.cj.jdbc.Driver";
	private String BD_URL = "jdbc:mysql://localhost:3306/bibliotecavirtual";
	private String USER = "root";
	private String PASS = "";
	
	public Connection getConexion() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(BD_URL,USER,PASS);
		}catch(Exception e) {
			System.out.println("¡ Problemas para conectar a la Base de Datos !");
		}
		return con;
	}
	
}
