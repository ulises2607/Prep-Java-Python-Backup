package Prueba;
import java.util.*;

import Actividad5.Contacto;
public class ejecutable1 {

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		
		
		ArrayList <Contacto> Agenda = new ArrayList(10);
		
		boolean salir = false;
		while(!salir) {
			
	// Comienzo
			System.out.println("Ingrese si resgistrar un contacto a la agenda: ");
			System.out.println("1) Agregar contacto 2) No agregar   3)Cuantos contactos hay en la agenda");
			System.out.println("4) Mostrar agenda");
			int opcion = lectura.nextInt();
			
			switch(opcion) {
			
			case 1:
				
					System.out.println("Ingrese nombre del contacto: ");
					String nContacto = lectura.next();
					System.out.println("Ingrese numero del contacto: ");
					int numContacto = lectura.nextInt();
					Contacto contacto = new Contacto1(nContacto,numContacto);
					
					
					Agenda.add(contacto);
			
				
				
			case 2:
				salir = true;
			System.out.println("Finalizado");
			break;
			
			case 3:
				System.out.println("En la agenda hay "+ Agenda.size()+ " contactos");
				break;
			case 4:
				System.out.println("Agenda completa: ");
				for(int i=0;i<=Agenda.size();i++) {
					System.out.println("nombres"+Agenda.get(i));
					
				}
			}
			Agenda.add(contacto);
			int cantcont = Agenda.size();
	System.out.println("La cantidad de contactos agendados es: "+cantcont);
			
			
			
			
			
			
		}

	}

}
