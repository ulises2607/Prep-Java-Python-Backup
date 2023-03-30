import java.util.ArrayList;

public class ArrayListEj02 {
	public static void main(String [] args) {
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		b.add(18);
		b.add(22);
		b.add(-30);
		
		System.out.println("N° de elementos: " + b.size());
		
		System.out.println("El elemento que hay en la posicion 1 es " + b.get(1));
		
	}
}
