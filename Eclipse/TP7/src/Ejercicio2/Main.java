package Ejercicio2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int num = 0 ;
		System.out.println("Ingresar un valor entero: ");
		
		while((num<48) || (num >= 58)) {
			num = System.in.read();
			if (num != 13 && num != 10) {
				System.out.println("Ingresar un valor entero");
			}
		}
		System.out.println("El numero ingresado fue: " + (char) num);
	}

}
