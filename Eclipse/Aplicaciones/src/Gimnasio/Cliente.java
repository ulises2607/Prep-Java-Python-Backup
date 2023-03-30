package Gimnasio;

public class Cliente {
	private String nombre;
	private String apellido;
	private long dni;
	private String domicilio;
	private String telefono;
	
	public Cliente(String nombre, String apellido, long dni, String domicilio, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
		
	}
	// GETTERS
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {return apellido;}
	
	public long getDni() {return dni;}
	
	public String getDomicilio() {return domicilio;}
	
	public String getTelefono() {return telefono;}
	
	// SETTERS
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	public void setApellido(String ap) {
		this.apellido = ap;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public void setDomicilio(String dom) {
		this.domicilio = dom;
	}
	public void setTelefono(String tel) {
		this.telefono = tel;
	}
	
	
	

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio
				+ ", telefono=" + telefono + "]";
	}
	
	
}
