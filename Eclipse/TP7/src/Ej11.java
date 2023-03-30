import java.util.*;
public class Ej11 {

	public static void main(String[] args) {
		PriorityQueue<String> colaPrioridad = new PriorityQueue<String>();

		colaPrioridad.add("Galarza");
		colaPrioridad.add("Soria");
		colaPrioridad.add("Alvarez");
		colaPrioridad.add("Molina");
		
		System.out.println(colaPrioridad.poll());//--> Atiendo a Alvarez
		System.out.println(colaPrioridad.poll());//--> Atiendo a Galarza
		System.out.println(colaPrioridad.poll());
		
		System.out.println(colaPrioridad.peek());
		System.out.println(colaPrioridad.size());
		////////////////////////////////////////////////////////////////
		
		
	}

}
