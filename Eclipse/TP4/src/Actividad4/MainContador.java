package Actividad4;
import java.util.*;
public class MainContador {
	int ini;
	public static void main(String[] args) {
		Scanner ingresar = new Scanner(System.in);
		
		System.out.print("Ingrese el contador: ");
		 int ini = ingresar.nextInt();
		System.out.println();
		 Contador num1 = new Contador(ini);
		
	
		
		int x = num1.getIncremento(6);
		System.out.println("incremento: "+x);
		
		
	
	}

}
