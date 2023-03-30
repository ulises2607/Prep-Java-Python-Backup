package probando;
/**Método 1 : un enfoque obvio es escribir nuestra propia función sort() 
 * utilizando uno de los algoritmos estándar. Esta solución requiere volver 
 * a escribir todo el código de clasificación para diferentes criterios,
 *  como el número de rollo y el nombre.
 * @author Ulises
 *
 */

// Una clase para representar al estudiante
 class Estudiante {
	 int numero;
	 String nombre, domicilio;
	 
	 //Constructor
	public Estudiante(int numero, String nombre, String domicilio) {
		this.numero=numero;
		this.nombre = nombre;
		this.domicilio=domicilio;
	}
	
	//Metodo para imprimir los detalles del estudiantes en el amin
	
	public String toString() {
		return  this.numero + " " + this.nombre + " " + this.domicilio;
	}
		
}
