package Ejercicio1;
import java.util.*;
import java.io.*;
public class Main2 {

	public static void main(String[] args) throws IOException {
		
		String cadena;

		
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		
		
		
	
		// creacion de array
		int array [];
		array = new int[10];
		
		 
		
		for(int i = 0 ; i<10 ; i++) {
			System.out.println("Ingrese elemento ");
			
			cadena = teclado.readLine();
			int entero = Integer.parseInt(cadena);
			
			array[i]=entero;
			
			
			
		}
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		 
		

		entrada.close();
		teclado.close();
	}

}
