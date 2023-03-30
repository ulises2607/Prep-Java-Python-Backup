package claseen0;
import java.util.*;
public class EjecutableAnimales {

	public static void main(String[] args) {
		 String nombrePerro= null;
		 String nombreGato = null;
		 String nombreTortuga = null;
		 
		 
		 Animales ani1 = new Animales (nombrePerro, nombreGato, nombreTortuga);
		 
		 ani1.setPerro("Chispita");
		 ani1.setGato("Don Gato");
		 ani1.setTortuga("Manuela");
		 
		System.out.println("Nombre del perro: "+ani1.getPerro());
		System.out.println("Nombre del gato: "+ani1.getGato());
		System.out.println("Nombre de la tortuga: "+ani1.getTortuga());
		
		//PRUEBA SWITCH O IF
		
		Scanner leer = new Scanner(System.in);
		int agregarAnimal;
		
		System.out.println("Desea agregar animal?-- Si opc 1 --- No --opc 2");
		agregarAnimal = leer.nextInt();
		
		switch (agregarAnimal){
			case 1:
				System.out.println("Agregando animal");
				break;
			case 2:
				System.out.println("No se agrega animal");
				break;
				default:
					System.out.println("veremos");
				
		}
		
		
	}
	

}
