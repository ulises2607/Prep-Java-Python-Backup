package ProyectoBiblio;

import java.sql.*;

public class ConsultasSuscripcion {
	Conexion conn = new Conexion();
	Connection usarConexion = null;
	Statement stm = null;
	ResultSet rs = null;
	PreparedStatement ps;
	
	
	public void mostrarSuscripcion(int idUsuario) {
		
		
		try {
			usarConexion = conn.getConexion(); // estamos usando la llave
			String consulta = "SELECT * FROM suscripcion where idUsuario='" + idUsuario + "'";// usamos esta
			stm = usarConexion.createStatement();
			rs = stm.executeQuery(consulta); // tenemos toda la inf de usuarios
			
			if(rs.next()) {
				Suscripcion susc = new Suscripcion();
				
				susc.setIdPago(rs.getInt(1));
				susc.setIdUsuario(rs.getInt(2));
				susc.setProxVencimiento(rs.getDate(3));
				susc.setImporteCuota(rs.getFloat(4));
				
				System.out.printf("%2d,%10d,%10s,%2d%n,", susc.getIdPago(), susc.getIdUsuario(),
						susc.getProxVencimiento(), susc.getImporteCuota());
			}
			
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
		
	}
	
	public Suscripcion estaPagada(int idUsuario,int idPago) {
		Suscripcion  suscripcionPagada = null;
		
		try {
			usarConexion = conn.getConexion(); // estamos usando la llave
			String consulta = "SELECT * FROM suscripcion where idUsuario='" + idUsuario + "' and idPago='"+idPago+"'";// usamos esta
			stm = usarConexion.createStatement();
			rs = stm.executeQuery(consulta); // tenemos toda la inf de usuarios
			
			if(rs.next()) {
				Suscripcion susc = new Suscripcion();
				
				susc.setIdPago(rs.getInt(1));
				susc.setIdUsuario(rs.getInt(2));
				susc.setProxVencimiento(rs.getDate(3));
				susc.setImporteCuota(rs.getFloat(4));
				
				suscripcionPagada = susc;
			}else {
				System.out.println("Suscripcion no pagada");
			}
			
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
		return suscripcionPagada;
	}
	
	
}
