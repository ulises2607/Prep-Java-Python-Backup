package ListaEjemplo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class listas {

	public static void lista() {
List <String> list = new ArrayList<String>();
		
		// añadimos elementos
		
		list.add("barby");
		list.add("fisu");
		list.add("chalem");
		list.add("Ulises");
		list.add("dongato");
		
		//Obtenemos un iterador y Recorrremos la lista
		//Iterator<String> lista = new list.iterator
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
		
		public static void cola() {
			Queue<Integer> cola = new LinkedList<Integer>();
			System.out.println("Agregando valores");
			for(int i = 0 ; i <6 ; i++) {
				cola.add(i);
				System.out.println("Valor: "+ i);
				
			}
			System.out.println("tamaño inicial de la cola: "+ cola.size());
			System.out.println("Retirando valores");
			while(cola.peek()!=null) {
				System.out.println("Valor: "+cola.poll());
				System.out.println("Tamaño actual de la cola: " + cola.size());
				
			}
			System.out.println("tamaño final de la cola: " + cola.size());
		}
	
	public static void pila() {
		Stack<Integer> pila = new Stack();
		System.out.println("Agregando valores");
		for(int i = 0 ; i < 5 ; i++) {
			pila.push(i);
			System.out.println("Valor: "+i);
		}
		System.out.println("Tamaño Inicial de la pila: "+ pila.size());
		System.out.println("Retirando valores");
		while(!pila.isEmpty()) {
			System.out.println("Valor: "+ pila.pop());
			System.out.println("Tamaño actual de la pila; "+pila.size());
		}
		System.out.println("Tamaño final de la pila: " + pila.size());
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		//cola();
		//pila();
		lista();
		
		

	}

}
