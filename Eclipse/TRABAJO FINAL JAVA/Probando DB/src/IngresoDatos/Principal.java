package IngresoDatos;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ControlDatos cd = new ControlDatos();
	/*	int opcion;
		
		System.out.println("-------Iniciando Programa------");
		System.out.println("Marque la opcion correspondiente");
		System.out.println("(1) - Insertar Dato");
		System.out.println("(2) - Borrar Dato");
		System.out.println("(3) Buscar Dato");
		
		opcion = leer.nextInt();
		*/
		////////////////////////////////////////////////////////
		
		
		/*	System.out.println("Ingrese el nombre del nombre");
			String nombre = leer.nextLine();
			
			System.out.println("Ingrese la edad");
			int edad = leer.nextInt();
			
			System.out.println("Ingrese el sexo");
			String sexo = leer.next();
			
			sexo = sexo.toUpperCase();
			
			if(sexo.equals("MASCULINO")) sexo = "M";
			if(sexo.equals("FEMENINO")) sexo = "F";
			
			cd.insertar(nombre, edad, sexo);
			*/
			///////////////////////////////////////////
			
			System.out.println("Ingrese de quien desea realizar la modificacion de edad");
			String nombre = leer.nextLine();
			
			System.out.println("Ingrese la nueva edad");
			int edad = leer.nextInt();
			
			cd.modificarEdad(edad,nombre);
			
			
			
	
		
	}
}

