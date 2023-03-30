package Ejercicio1;
import java.io.*;
public class Ejercicio2 {
	public static void main(String []args) throws IOException {
		
		BufferedReader entrada;
		
		entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese un numero entero: ");
		int d= Integer.parseInt(entrada.readLine());
		
		if(d==0) {
			System.out.println("El numero es nulo");
		}else if(d<0) {
			System.out.println("El numero es negativo");
		}else {
			System.out.println("El numero es positivo");
		}
		
	}
}
