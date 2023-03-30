package pruebasSQL;

import java.sql.*;

public class principalTest {
		
	private String nombre;
	private String autor;
	private int tipo;
	private int cantidad;
	private int descargas;
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	
	static final String USER = "root";
	static final String PASS = "";
	

	
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try { //paso 2 registrar JDBC driver
			Class.forName(JDBC_DRIVER);
			// paso 3 abrir una conexion
			System.out.println("Conectando a la base de datos... Abriendo conexion");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Creando statement!...");
			stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO libros(nombre,autor,tipo) values(?,?,?)";
			ResultSet rs = stmt.executeQuery(sql);
			//Extraer datos del resultset
			
			while(rs.next()) {
				//escribir por columna
				String nombre = rs.set
				
			
			}
			
		}catch (SQLException se){
			se.printStackTrace();
			System.out.println("Problemas con el sql");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("aca para errores de clas, forname");
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
			} catch (SQLException se2) {
				// Nada que podamos hacer
			}
			try {
				if(conn!=null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} //Cierre  try
		} // cierra finally
		
			
		System.out.println("Bueno veamos si llego hasta aca");

		}
	}
