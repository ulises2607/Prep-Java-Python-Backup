package Basicos;
// Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int sumatoria = 0;
		System.out.println("Ingresa el numero hasta donde se realizara la sumatoria");
		int num = leer.nextInt();
		
		for (int i=0;i<num;i++) {
			
	 sumatoria = sumatoria + i;
		}
System.out.println(sumatoria);
	}

}
