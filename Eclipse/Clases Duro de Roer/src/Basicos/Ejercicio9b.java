package Basicos;

import java.util.Scanner;

public class Ejercicio9b {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num;
		System.out.println("Ingresa el numero hasta donde se realizara la sumatoria");
		
		
		do {
			num = leer.nextInt();
			if(num<=1) {
				System.out.println("Error. No has introducido un valor correcto."
						+ "Vuelve a intentarlo");
			}
			
			
		}while(num<=1);
		int suma=0;
		
		for(int contador = 1 ; contador<=num;contador++) {
			suma +=contador;
		}
		System.out.println(suma);
	}

}
