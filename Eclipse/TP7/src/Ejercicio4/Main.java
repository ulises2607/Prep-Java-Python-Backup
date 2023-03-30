package Ejercicio4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char respuesta;
		
		do {
			System.out.println("Termina cuando ingresa 's' o 'S'");
			respuesta = sc.nextLine().charAt(0);
			
		}while(respuesta != 's' && respuesta != 'S');
		

	}

}
