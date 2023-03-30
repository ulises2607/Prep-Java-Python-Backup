import java.util.ArrayList;

public class EjemploArrayList01 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("N° de elementos: " + a.size());
		
		a.add("Rojo");
		a.add("verde");
		a.add("azul");
		
		System.out.println("N° de elementos: " + a.size());
		
		a.add("Blanco");
		
		System.out.println("N° de elementos: " + a.size());
		
		System.out.println("El elemento que hay en la posicion 0 es "+ a.get(0));
		System.out.println("El elemento que hay en la posicion 3 es "+a.get(3));
		
		a.add("Amarillo");
		
		System.out.println("Contenido de la lista: ");
		
		for(int i = 0 ; i < a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		//////////////////////////////////////////////////////////////////////////
		System.out.println("Otra manera de mostrar los elementos::::");
		
		for (String color: a) {
			
			System.out.println(color);
		}
		
	}
	//////////////////////////////////////////////////////////////////////////////
	
	

}
