package Ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese un digito: ");
	String digito = sc.nextLine();	
	
	
	
	try {
		int digitoConvertido = Integer.parseInt(digito);
		System.out.println(digitoConvertido);
	} catch (Exception e) {

System.err.println("Error en la convercion");
	}
	
	}

}
