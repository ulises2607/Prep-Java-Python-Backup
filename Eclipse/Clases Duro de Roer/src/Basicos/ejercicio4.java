package Basicos;
import java.util.*;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
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


