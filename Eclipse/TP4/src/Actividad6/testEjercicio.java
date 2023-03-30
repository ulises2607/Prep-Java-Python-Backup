package Actividad6;
import java.util.*;
public class testEjercicio {

	public static void main(String[] args) {
		
		//Crear 3 objetos
		
		DirectorCine dc1 = new DirectorCine("Steven","Spielberg",75);
		DirectorCine dc2 = new DirectorCine("Quentin","Tarantino",59);
		DirectorCine dc3 = new DirectorCine("Christopher","Nolan",51);
		
		ArrayList <DirectorCine> direCin = new ArrayList();
		
		direCin.add(dc1);
		direCin.add(dc2);
		direCin.add(dc3);
		
		
		for (int i = 0 ; i< direCin.size(); i++) {
			System.out.println(direCin.get(i).getNombre());
			System.out.println(direCin.get(i).getApellido());
			System.out.println(direCin.get(i).getEdad());
		}
		
		

	}

}
