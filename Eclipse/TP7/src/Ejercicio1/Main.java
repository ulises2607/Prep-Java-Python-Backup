package Ejercicio1;
import java.util.*;
import java.io.*;
public class Main {
	public static void main (String []args) throws IOException {
		
	int c;
	int contador = 0 ;
	
	System.out.println("Se lee hasta encontrar un fin de linea: ");
	
	while((c=System.in.read()) != '\n') {
		contador++;
		
		System.out.println("Lo que interpreta el compilador"+c);
		
		System.out.println("Lo que ve la persona: "+ (char) c);
	}
	
		System.out.println();
		System.out.println("Contados "+ contador + " bytes ent total");
		
		
		String s;
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		
		s = teclado.readLine();
		System.out.println(s);
		
		System.out.println("contados "+ s.length() + " bytes en total.");
		
	
	}

}
