package Ejercicio6;
import java.io.*;
public class Main {

	public static File Constructor_1() {
		File fichero = new File("C:\\Users\\Ulises\\Desktop\\Eclipse\\TP7\\src\\Ejercicio6\\textoej6.txt");
		return fichero;
	}
	public static void escribir(String direccion) throws FileNotFoundException{
		FileWriter archivo = null;
		BufferedWriter texto = null;
		try {
			archivo = new FileWriter(direccion);
			texto = new BufferedWriter(archivo);
			System.out.println("Cargando numeros naturales: ");
			for(int i = 1 ; i < 101 ; i++) {
				System.out.println();
				texto.write(i + ""); // es un enter o retorno de carro
				if((i%10) == 0) {// si es multiplo de 10
					texto.newLine(); //pasa a la sigueinte linea
				}else {
					texto.write(" ");
				}
				
			}
			texto.flush(); // vacia el buffer escribiendo su contenido
			System.out.println("fichero Creado: ");
			
			
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
		
		escribir(fichero.getAbsolutePath());

	}

}
