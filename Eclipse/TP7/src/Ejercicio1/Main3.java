package Ejercicio1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args)throws IOException {
		
		
		ByteArrayOutputStream bOut = new ByteArrayOutputStream(12);
		
		while(bOut.size() !=10) {
			
			// gets the inputs form the user
			
			bOut.write("hola mundo".getBytes());
			
		}
		byte b [] = bOut.toByteArray();
		
		System.out.println("Imprimimos el contenido de b []: ");
		
		
		for(int i = 0 ; i < b.length ; i++) {
			
			//Esto para imprimir los caracteres
			
			System.out.println((char)b[i] + " ");
		}
		System.out.println("      ");
		
		int c; 
		
		ByteArrayInputStream bIn = new ByteArrayInputStream(b);
		
		System.out.println("Convirtiendo los caracteres en UpperCase, es decir mayus");
		
		for(int i = 0 ; i < 1 ; i++) {
			while((c = bIn.read()) != -1) {
				System.out.println(Character.toUpperCase((char) c));
			}
			bIn.reset();
		}
		
		

		
		

	}

}
