package ProyectoBiblio;

public class HistorialDescarga {
	private int idHisDescarga;
	private int idLibro;
	private int idUsuario;
	private String fecha;
	private int cantidadDia;
	private int cantidadMes;
	
	public HistorialDescarga() {
		
	}

	
	public HistorialDescarga(int idHisDescarga, int idLibro, int idUsuario, String fecha, int cantidadDia,
			int cantidadMes) {
		super();
		this.idHisDescarga = idHisDescarga;
		this.idLibro = idLibro;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
		this.cantidadDia = cantidadDia;
		this.cantidadMes = cantidadMes;
	}
	
	public HistorialDescarga(int idLibro, int idUsuario, String fecha, int cantidadDia, int cantidadMes) {
		super();
		this.idLibro = idLibro;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
		this.cantidadDia = cantidadDia;
		this.cantidadMes = cantidadMes;
	}

	public int getIdHistDescarga() {
		return idHisDescarga;
	}
	public void setIdHisDescarga(int idHisDescarga) {
		this.idHisDescarga = idHisDescarga;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCantidadDia() {
		return cantidadDia;
	}
	public void setCantidadDia(int cantidadDia) {
		this.cantidadDia = cantidadDia;
	}
	public int getCantidadMes() {
		return cantidadMes;
	}
	public void setCantidadMes(int cantidadMes) {
		this.cantidadMes = cantidadMes;
	}

	

}
