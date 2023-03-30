package Basicos;
// Pedir dos palabras por teclado, indicar si son iguales.
import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Escribe la palabra 1: ");
		String palabra1 = sn.next();
		System.out.println("Escribe la palabra 2; ");
		String palabra2 = sn.next();
			
		// IGNORE CASE IGNORARIA SI EL HECHO DE QUE SEAN MAYUSCULAS O MINUSCULAS
		
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales");
		}else {
			System.out.println("Las palabras no son iguales");
		}
		
	}

}
