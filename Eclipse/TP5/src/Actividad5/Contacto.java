package Actividad5;

public class Contacto  {
	private String nombre;
	private int telefono;
	
	public Contacto (String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int t) {
		this.telefono = t;
	}

	//Cuando son iguales
	public boolean equals (Contacto c) {
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
