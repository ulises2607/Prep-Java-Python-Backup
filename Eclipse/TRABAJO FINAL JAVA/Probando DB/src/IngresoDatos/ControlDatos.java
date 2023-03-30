package IngresoDatos;

import java.sql.*;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class ControlDatos {
	private Conectar conectar;
	private ModeloDatos modelo;
	private Connection con;
	private DefaultTableModel DT;
	

	public ControlDatos() {
		conectar = new Conectar();
		modelo = new ModeloDatos();
	}
	
	public void insertar(String nombre, int edad, String sexo) {
		PreparedStatement ps;
		String sql;
		
		modelo.setNombre(nombre);
		modelo.setEdad(edad);
		modelo.setSexo(sexo);
		
		try {
			con = conectar.getConexion();
			sql = "Insert into datos(nombre,edad,sexo) values(?,?,?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, modelo.getNombre());
			ps.setInt(2, modelo.getEdad());
			ps.setString(3, modelo.getSexo());
			
			ps.executeUpdate();
			
			System.out.println("Se han insertado los datos");
			
			
		}catch(SQLException e) {
			System.out.println("Error de conexion: "+e.getMessage());
		}
		
	}

	public void modificarEdad(int edad,String nombre) {
		
		PreparedStatement ps;
		String sql;
		
		
		modelo.setEdad(edad);
		
		try {
			con = conectar.getConexion();
			sql = "UPDATE datos edad='"+edad+"' WHERE nombre ='"+ nombre+"'";
			ps = con.prepareStatement(sql);
			
			ps.setObject(1, edad);
			
			ps.executeUpdate();
			System.out.println("Edad modificada");
		}catch(SQLException s) {
			System.out.println("Error de conexion: "+s.getMessage());
		}
		
	}
}
