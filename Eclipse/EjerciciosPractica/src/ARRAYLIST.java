import java.util.ArrayList;
public class ARRAYLIST {

	public static void main(String[] args) {
		ArrayList<String> depa3b = new ArrayList<>();
		
		//agregar elementos con ADD
		
		depa3b.add("Fisu");
		depa3b.add("Salem");
		depa3b.add("Barby");
		depa3b.add("Ulises");
		
		System.out.println("Los que estan en el depa 3b son: "+depa3b);
		
		//Acceder a un elemento
		String maslinda = depa3b.get(2);
		
		System.out.println("La mas linda del depa 3 es "+maslinda);
	}

}
