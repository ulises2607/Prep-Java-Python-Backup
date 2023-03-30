package Basicos;


import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String [] args) {
		
Scanner sn = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		
		String frase = sn.nextLine();
		
		frase = frase.replace('a', 'e');
		frase = frase.replace('i', 'o');
		
		System.out.println(frase);
		
	}
}
