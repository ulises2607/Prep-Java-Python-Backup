package Basicos;
// Dada una cadena, extraer la cuarta y la quinta letra usando el metodo substring
import java.util.*;
public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingrese cadena");
		String cadena = sn.nextLine();
		
		String subcadena = cadena.substring(3,5);
		
		System.out.println(subcadena);
		
	}

}
