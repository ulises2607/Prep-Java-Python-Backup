package Prueba;
import java.util.*;

//Va a estar formada por un conjunto de contactos
public class Agenda1 {
	private Contacto1 [] contactos;
	
	
	public Agenda1 () {
		this.contactos = new Contacto1[10];
	}
	
	public Agenda1 (int tamanio) {
		this.contactos = new Contacto1[tamanio];
	}
	
	public void aniadirContacto(Contacto1 c) {
		
		
		
		boolean encontrado = false;
		for(int i=0; i<contactos.length;i++) {
			
			if (contactos[i]==null) {
				contactos[i]=c;
				encontrado = true;
			}
		}
		if(encontrado) {
			System.out.println("Se ha añadido");
		}else {
			System.out.println("no se ha podido añadir");
		}
	}
	boolean encontrado = false;
	public boolean existeContacto(Contacto1 c) {

		for(int i=0; i<contactos.length;i++) {
			
			if (contactos[i]==null) {
				contactos[i]=c;
				encontrado = true;
			}
		}
		return encontrado;
	}
}
	
