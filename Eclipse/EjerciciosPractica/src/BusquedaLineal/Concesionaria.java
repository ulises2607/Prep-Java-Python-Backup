package BusquedaLineal;
import java.util.*;
public class Concesionaria {
	private String nombre;
	private HashSet<Auto> autos;
	
	public Concesionaria (String nombre) {
		this.nombre = nombre;
		this.autos = new HashSet<>();
	}
	public void agregarAuto(Auto a) {
		this.autos.add(a);
	}
	public int cantAutos() {
		return autos.size();
	}
	// Metodo atado a la que la coleccion sea una lista
	// usando un metodo for each. Contra: recorre todo el vector y no corta cuando encuentra
	/*public Auto buscarAuto(String patente) {
	*	Auto autoEncontrado = null;
	*	for (Auto auto : autos) {
	*		System.out.println("Viendo al auto" + auto.getPatente());
	*		if(auto.getPatente().equalsIgnoreCase(patente)) {
	*			autoEncontrado = auto;
	*		}
	*	}
	*	return autoEncontrado;
	}
	*/
	//SE MEJORARA CON CICLO WHILE
	
	/*public Auto buscarAuto(String patente) {
	*	Auto autoEncontrado = null;
	*	int i=0;
	*	while(i < cantAutos() && autoEncontrado == null) {
	*		Auto auto = this.autos.get(i);
	*		System.out.println("viendo al auto: "+auto.getPatente());
	*		if(auto.getPatente().equalsIgnoreCase(patente)) {
	*			autoEncontrado = auto;
	*		}
	*		i++;
	*	}
	*	return autoEncontrado;
	}*/
	
	// Mejorando un poco mas
	
	/*public Auto buscarAuto(String patente) {
	*		Auto autoEncontrado = null;
	*		int i=0;
	*		while(i < cantAutos() && !this.autos.get(i).getPatente().equalsIgnoreCase(patente)) {
	*			i++;
	*		}
	*		if(i < cantAutos()) {
	*			autoEncontrado = this.autos.get(i);
	*		}
	*		return autoEncontrado;
	}*/
	
	//METODO MAS UNIVERSAL CON ITERADOR
	
	public Auto buscarAuto(String patente) {
				Auto autoEncontrado = null;
				Iterator<Auto> it = this.autos.iterator();
				while(it.hasNext() && autoEncontrado == null) {
					Auto a = it.next();
					if(a.getPatente().equalsIgnoreCase(patente)) {
						autoEncontrado = a;
				}

		}
				return autoEncontrado;
	}
}
