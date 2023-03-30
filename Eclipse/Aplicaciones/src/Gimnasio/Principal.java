package Gimnasio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Principal {
	

	
	
	
	public static void main(String [] args) {
		
		// Creando el gym
		
		Gym G = new Gym ("Super SayaGym" , "Ulises" , "passgym");
		
		// Carga de clientes
		cargarGym(G);
		
		// Listar
		G.mostrarClientes();
		
		
	}
	
public static void cargarGym(Gym G) {
		
		G.agregarCliente(new Cliente("Ulises","Cappa",35261205,"Dean funes 1098", "3876366869"));
		G.agregarCliente(new Cliente("Franco","Cappa",3726526, "Dean funes 1098", "3876555111"));
		G.agregarCliente(new Cliente("Musculoso","Aguirre",36555444,"Cdm esquina", "3875123456"));
		G.agregarCliente(new Cliente("Barby","Segura",36803273,"Leguizamon 755", "3876448468"));
		G.agregarCliente(new Cliente("Toxivan","Oviedo",33265214,"Dean funes 1400", "3876547789"));
		G.agregarCliente(new Cliente("Yerman", "batata", 30546125,"Pasaje Rojas 123", "387444666"));
	}
	
}
