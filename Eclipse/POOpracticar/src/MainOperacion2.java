import java.util.*;

public class MainOperacion2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese numero 1");
		
		int n1 = leer.nextInt();
		System.out.println("Ingrese numero 2");
		int n2 = leer.nextInt();
	//Creacion de objeto op2
		Operacion2 op2 = new Operacion2();
		
		op2.sumar(n1,n2);
		op2.restar(n1, n2);
		op2.multiplicar(n1, n2);
		op2.dividir(n1, n2);
		
		op2.mostrarResultados();
		

	}

}
