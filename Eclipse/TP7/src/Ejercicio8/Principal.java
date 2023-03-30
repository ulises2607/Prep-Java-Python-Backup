package Ejercicio8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Principal {
	
	public static File Constructor() {
		File fichero = new File("C:\\Users\\Ulises\\Desktop\\Eclipse\\TP7\\src\\Ejercicio8\\ArchivoAOrdenar");
		return fichero;
	}
	public static void ordenarArchivo(String direccion) throws IOException {
		FileReader archivo = null;
		BufferedReader texto = null;
		try {
			archivo = new FileReader(direccion);
			texto = new BufferedReader(archivo);
			String lectura = "";
			int linea = 1;
			System.out.println("Filas ordenadas: ");
			while((lectura = texto.readLine()) != null) {
				String [] fila = lectura.split(",");
				char [] filaChar = null;
				char []  filaCharOrd = null;
				System.out.println("Linea Ordenada N° "+linea+ " es ");
				
				linea++;
				
				
				for(int i = 0 ; i< fila.length ; i++) {
					filaChar = fila[i].toCharArray();
					Arrays.sort(filaChar);
					System.out.println(filaChar);
				}
				
				
				}
		
			
		}catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado"); //muestra mensaje de error si no encontro el archivo
		}catch(IOException e) {
			System.out.println("Error! " + e.getMessage()); // muestra un mensaje de error si no puede abrir el archivo
		}finally {
			try {
				texto.close();
				archivo.close();
			} catch (IOException e) {
				System.out.println("Error! " + e.getMessage());
			}
			}
	}
	
	
	
	
	public static void main (String [] args) throws IOException {
		
		File fichero = Constructor();
		
		ordenarArchivo(fichero.getAbsolutePath());
		
	}
}
