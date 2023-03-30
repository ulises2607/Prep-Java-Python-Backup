package Ejercicio3;

import java.io.*;

import javax.security.auth.login.AppConfigurationEntry;

/**
 * Ejercicio Nro 3
Ingresar un número por teclado solicitando el precio de un producto “x”
(puede tener decimales) y calcule el precio final con IVA. El IVA será una constante
del 10.5%. Usar InputStreamReader y Scanner
 * @author Ulises
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		
		double precio;
		System.out.println("Ingresar el precio del producto x: ");
		String p = teclado.readLine();
		double pConvertida = Double.parseDouble(p);
		double iva = pConvertida *10.5 / 100;
		
		precio = pConvertida + iva;
		
		
		
		System.out.println("El precio final es : $"+precio);

	}

}
