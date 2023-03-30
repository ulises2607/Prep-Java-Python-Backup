package IngresoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
	public static Connection con;
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/pruebajava";
    
    public static final String USER = "root";
    public static final String CLAVE = "";
    
    public Connection getConexion() {
    	con = null;
    	try {
    		Class.forName(DRIVER);
    		con = DriverManager.getConnection(URL,USER,CLAVE);
    		if(con != null) {
    			System.out.println("Conexion establecida!...");
    		}
    	}catch(Exception e ) {
    		System.out.println("Error: " + e.getMessage());
    	}
    	return con;
    }
    public void desconectar() {
    	con = null;
    	if(con == null) {
    		System.out.println("Conexion terminada!...");
    	}
    }

}
