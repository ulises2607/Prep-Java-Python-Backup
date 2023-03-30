
public class Persona {
	//atributos
	public String nombre;
	public int edad;
	public Mascota mascota; // Esto es un objeto
	
	//constructor
	public Persona(String nombreParametro, int edadParametro, Mascota mascoparam) {
		//damos valor a los atributos --> this --> llamamos a los atributos
		this.nombre = nombreParametro;
		this.edad= edadParametro;
		this.mascota = mascoparam;
		
	}
}
