package Ejercicio7;
import java.io.*;

public class Ejercicio7 {

	public static File Constructor_1() {
		File fichero = new File("C:\\Users\\Ulises\\Desktop\\Eclipse\\TP7\\src\\Ejercicio7\\texto8.txt");
		return fichero;
	}
	
	public static void sumar_archivo(String direccion) {
		FileReader archivo = null;
		BufferedReader texto = null;
		try {
			archivo = new FileReader(direccion);
			texto = new BufferedReader(archivo);
			String lectura = "";
			int linea = 1;
			System.out.println("El resultado de las sumas: ");
			while((lectura = texto.readLine()) != null) {
				String [] fila = lectura.split(",");
				int suma = 0;
				for (int i = 0 ; i < fila.length ; i++) {
					suma = suma + Integer.parseInt(fila[i]);
				}
				System.out.println("Linea Nro " + linea + " es: " + suma);
				linea++;
			}
			
		} catch (FileNotFoundException e) {
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
	
	
	public static void main(String[] args) throws IOException {
		
File fichero = Constructor_1();
		
		if(!fichero.exists()) {
			System.out.println(fichero);
			System.out.println("El fichero: '" + fichero.getName() + "' no existe");
			System.out.println("Creando fichero.text");
			if(fichero.createNewFile()) {
				System.out.println(fichero.getName() + " creado con exito!!!0");
			}else {
				System.out.println("No se ha podido crear " + fichero.getName());
			}
		}
		
	sumar_archivo(fichero.getAbsolutePath());
	

	}

}
