package Basicos;
import java.util.*;

// Pedir 2 numeros por teclado e indicar si uno es mayor que el otro o si son iguales.
public class Ejercicio5 {
	public static void main(String []args) {
	Scanner sn = new Scanner(System.in);
	
	System.out.println("Introduzca el numero 1: ");
	int num1 = sn.nextInt();
	
	System.out.println("Introduzca el numero2: ");
	int num2 = sn.nextInt();
	
	if(num1 <= num2) {
		if(num1==num2) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("El numero "+num2+" es el mayor");
		}
		
	}else {
		System.out.println("El numero "+num1+" es el mayor");
		}
	}
}
