
public class Persona {
//Atributos
	String  nombre;
	int edad;
	String dni;
//* El primer metodo que se suele crear es el constructor. No se le pone el valor de retorno.
//Facilita la inicializacion de la clase
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String dni) {
		super();
		this.dni = dni;
	}
	public void correr() {
		System.out.println("soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton");
	}
public void correr(int km) {
	System.out.println("He corrido "+km+" kilometros");
}
	public void mostrarDatos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
	}
	
}
