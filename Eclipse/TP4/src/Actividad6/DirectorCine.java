package Actividad6;

public class DirectorCine {
	//Atributos
	public String nombre;
	public String apellido;
	public int edad;

	//Metodo constructor por defecto
	public DirectorCine() {
		
	}
	//Metodo constructor con parametros
	public DirectorCine(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
	public void setApellido(String a) {
		this.apellido = a;
	}
	public void setEdad(int e) {
		this.edad = e;

}
}
