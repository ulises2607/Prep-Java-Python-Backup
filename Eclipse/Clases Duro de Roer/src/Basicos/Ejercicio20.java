package Basicos;

import java.util.Scanner;

//Decir la posicion de un caracter
public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		
		String frase = sn.nextLine();
		
		int pos = frase.indexOf('a');
		
		System.out.println(pos);
		
		pos = frase.indexOf('a', pos+1);
		
		System.out.println(pos);

	}

}
