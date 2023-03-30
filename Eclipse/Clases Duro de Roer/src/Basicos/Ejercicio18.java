package Basicos;
// Dada una frase, separarla en palabras
import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		
		String frase = sn.nextLine();
		// Split separa los conjuntos, es decir palabras separadas por un espacio.
		String palabras [] = frase.split(" ");

		for (int i=0; i<palabras.length;i++) {
			
			System.out.println(palabras[i]);
		}
	}

}
