package Prueba;

public class Contacto1 {
	private String nombre;
	private int telefono;
	
	
	public Contacto1(String nombre, int numero) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setNumero(int numero) {
		this.telefono = telefono;
	}
	
	public boolean equals(Contacto1 c) {
		
		if(this.nombre.equalsIgnoreCase(c.getNombre())) {
		return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "nombre=" + nombre + ", telefono=" + telefono;
	}
	
	

	
	
}
