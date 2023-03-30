package ConexionBDClases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	Connection con; // variable especial para la conexion
	private String DRIVER = "com.mysql.cj.jdbc.Driver";
	private String BD_URL= "jdbc:mysql://localhost:3306/holamundo";
	private String USER = "localhost";
	private String PASS = "";
	
	public Connection conectar() {
		try {
			Class.forName(DRIVER); // solamente vamos a decirle que utilice un driver (linea6)
			con = DriverManager.getConnection(BD_URL,USER,PASS); //ayuda a hacer el vinculo
			System.out.println("Conexion exitosa");
		}catch(Exception e) {
			System.out.println("Problemas al intentar conectar a la bd");
		}
		return con;

	}

}