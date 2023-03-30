package Basicos;
import java.util.*;
public class Union4y5 {
	public static void main(String []args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Ingrese la opcion que desea realizar");
		System.out.println("1. Saber que numero es mayor");
		System.out.println("2. Averiguar paridad de un numero");
		
		int opcion = sn.nextInt();
		
		if(opcion ==1) {
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
		if(opcion==2) {
			int num = sn.nextInt();
			
			if(num%2 ==0) {
				System.out.println("El numero "+num+" es par");
				}
				else if(num == 0) {
					System.out.println("El numero eso 0");
					
				}
				else {
					System.out.println("El numero "+num+" es imparr");
				}
		}
	}
	
}
