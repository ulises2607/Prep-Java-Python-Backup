package probando;
/**M�todo 1 : un enfoque obvio es escribir nuestra propia funci�n sort() 
 * utilizando uno de los algoritmos est�ndar. Esta soluci�n requiere volver 
 * a escribir todo el c�digo de clasificaci�n para diferentes criterios,
 *  como el n�mero de rollo y el nombre.
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
