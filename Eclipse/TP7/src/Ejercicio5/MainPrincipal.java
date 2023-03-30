package Ejercicio5;
import java.io.*;
public class MainPrincipal {

	/**
	 * Crear un fichero de texto con el nombre y contenido que tú desees. Por
ejemplo, Ejercicio1.txt. Realiza un programa en Java que lea el fichero
<<Ejercicio1.txt>> carácter a carácter y muestre su contenido por pantalla sin
espacios.

	 * @return
	 */
	
	public static File Constructor_1() {
		//le envio la ruta del archivo
		File fichero = new File("C:\\Users\\Ulises\\Desktop\\Eclipse\\TP7\\src\\Ejercicio5\\ejemplo5.txt");
		return fichero;
	}
	public static void leer(String direccion)throws FileNotFoundException{
		FileReader archivo = null;
		BufferedReader texto = null;
		
		try {
			archivo = new FileReader(direccion);
			texto = new BufferedReader(archivo);
			String lectura= "";
			int caracter = 0;
			
			while(texto.ready()) {
				caracter = texto.read();
				if(caracter != 32) { //32 es espacio en blanco
					lectura = lectura + (char) caracter; //acumulo los uqe no son espacios en blanco
				}
			}
			if(lectura.length() > 0) {
				System.out.println("Contenido del archivo: ");
				System.out.println(lectura); //Imprimimos la secuencia
			}else {
				System.out.println("No tiene contenido");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado"); //muestra un mensaje de error si no encontro el archivo
			
		} catch(IOException e) {
			System.out.println("Error! " + e.getMessage());//Muestra un mensaje de error si no puede abrir el archivo
			
		}finally {
			try {//cerramos los flujos abiertos
			texto.close();
			archivo.close();
			
			}catch(IOException e) {
				System.out.println("Error! " + e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		File fichero = Constructor_1();
		
		if(fichero.exists()) {
			System.out.println(fichero);
			System.out.println("El fichero: '" + fichero.getName() + "' no existe");
			System.out.println("Creando fichero.text");
			if(fichero.createNewFile()) {
				System.out.println(fichero.getName() + " creado con exito!!!0");
			}else {
				System.out.println("No se ha podido crear " + fichero.getName());
			}
		}
		
		leer(fichero.getAbsolutePath());
	}

}


















