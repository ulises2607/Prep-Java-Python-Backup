package Ejercicio1;
import java.io.*;
public class a1 {
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca un numero entero positivo");
		int a = Integer.parseInt(entrada.readLine());
		if(a%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("el numero es impar");
		}

	}
	
	

}
