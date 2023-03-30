package Ejercicio6;
import java.util.*;
public class Ejecutable {
	public static void main(String [] args) {
		Scanner leer = new Scanner(System.in);
	
		TarifaTaxi ta1 = new TarifaTaxi(1,58);
		TarifaTaxi ta2 = new TarifaTaxi(2,70);
		
		ArrayList Listaxis = new ArrayList();
		
		Taxi taxi1 = new Taxi(124,12,ta1);
		
		Listaxis.add(taxi1);
		
		boolean salir = false;
		
		
		while(!salir) {
		
		System.out.println("---------Taxifario 2022---------");
		System.out.println("Digite opcion: ");
		System.out.println("1. Agregar taxi");
		System.out.println("2. Cambiar tarifa");
		System.out.println("3. Iniciar traslado y total a pagar");
		System.out.println("4. Modificar tarifas");
		System.out.println("5. Finalizar");
		
		int opcion = leer.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Ingrese numero de licencia:");
				long nlic = leer.nextLong();
			System.out.println("Ingrese numero Taxi:");
				int ntax = leer.nextInt();
				
		case 2:
			
		
		
		}
		
		}
	}
}
