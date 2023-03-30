package ProyectoBiblio;

import java.sql.Date;

public class Suscripcion extends Usuario{
	private int idPago;
	private int idUsuario;
	private Date proxVencimiento;
	private float importeCuota;
	
	
	
	public Suscripcion() {
		
	}



	public Suscripcion(int idUsuario, String login, String clave, String nombre, String apellido, int categoria,
			int idPago, int idUsuario2, Date proxVencimiento, float importeCuota) {
		super();
		
		this.idPago = idPago;
		this.idUsuario = idUsuario2;
		this.proxVencimiento = proxVencimiento;
		this.importeCuota = importeCuota;
	}



	public int getIdPago() {
		return idPago;
	}



	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}



	public int getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public Date getProxVencimiento() {
		return proxVencimiento;
	}



	public void setProxVencimiento(Date date) {
		this.proxVencimiento = date;
	}



	public float getImporteCuota() {
		return importeCuota;
	}



	public void setImporteCuota(float importeCuota) {
		this.importeCuota = importeCuota;
	}



	
	
	
	
}
