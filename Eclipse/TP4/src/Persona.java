
public class Persona {
// Atributos: nombre apellido dni domicilio
	//M.A. Modificadores de Acceso ---> public private, public,...
	public String nombre;
	public String apellido;
	public int dni; // 37.106.547 poner que lea solo numeros
	public String domicilio;
	
	// Constructor: Se ejecuta solo, sin llamarlo
	public Persona(String param1, String param2, int param3, String param4 ) {
		// Asignar valor a los atributos
		this.nombre = param1;
		this.apellido= param2;
		this.dni= param3;
		this.domicilio=param4;
		
	}
	public void mostrar() {
		System.out.println("El nombre es "+ this.nombre);
		System.out.println("El apellido es "+ this.apellido);
		System.out.println("El dni es "+this.dni);
		System.out.println("El domicilio es "+this.domicilio);
	}
}
