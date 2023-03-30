package Clasemartesnoche;

public class Alumno extends Persona {
	// definicion de atributos
	private String comision;
	private Profesor profe;
	
	//metodo constructor
	public Alumno(String nombre, String ape, int edad, String domicilio, String comi, Profesor profe) {
		super(nombre,ape,edad,domicilio);
		this.comision=comi;
		this.profe=profe;
	}
	public void mostrar() {
		String datos=super.mostrar(this);
		System.out.println("Los datos del alumno son:");
		System.out.println(datos);
		System.out.println("la comision es: "+this.comision);
		this.profe.mostrar();
		
	}
	public void saludar() {
		System.out.println("hola soy un alumno");
	}






	public void setProfe(Profesor profe) {
		this.profe = profe;
	}

	public void mostrar1() {
		System.out.println("El nombre es "+nombre);
	}
}
