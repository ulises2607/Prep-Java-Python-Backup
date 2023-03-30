import java.sql.*;
public class Conexion_BBD {

	//Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BBD
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";
	//Credenciales de la BBD
	static final String USER = "root";
	static final String PASS = "";
	
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// Paso 2: Registrar JDBC driver
			Class.forName(JDBC_DRIVER);
			//Paso 3: Abrir una conexion
			System.out.println("Conectando a la base de datos...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			//Paso 4: Ejecutar consultas SQL
			System.out.println("Creando Statemento...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT Name, Code, Population FROM country";
			ResultSet rs = stmt.executeQuery(sql);
			//Extraer datos del ResultSet
			while(rs.next()) {
				//Recibir por tipo de columna
				int population = rs.getInt("Population");
				String Name = rs.getString("Name");
				String CountryCode = rs.getString("Code");
				//MOSTRAR VALORES
				System.out.print("Pais: "+ Name);
				System.out.print(", Codigo Pais: "+ CountryCode);
				System.out.print(", Poblacion: " + population + " habitantes");
				System.out.println();
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException se) {
			//Resolver errores para JDBC
			se.printStackTrace();
		}catch(Exception e) {
			//Resolver errors para class.forName
			e.printStackTrace();
		}finally {
			//Bloque finalmente utilizado para cerrar recursos
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
			} //Cierre finally try
		} // cierra try
		System.out.println("Nos vimos");
	}//Cierra main

}//cierrra clase


