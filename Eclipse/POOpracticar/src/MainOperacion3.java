import java.util.Scanner;

public class MainOperacion3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese numero 1");
		
		int n1 = leer.nextInt();
		System.out.println("Ingrese numero 2");
		int n2 = leer.nextInt();
	//Creacion de objeto op2
		Operacion3 op3 = new Operacion3();
		
		int suma = op3.sumar(n1,n2);
		int resta = op3.restar(n1, n2);
		int multiplicacion = op3.multiplicar(n1, n2);
		int division = op3.dividir(n1, n2);
		
		op3.mostrarResultados(suma, resta, multiplicacion, division);
		
//OTRA MANERA DE MOSTRAR SIN ALMACENAR LA VARIABLE
		
		//System.out.println("La suma es "+op3.sumar(n1,n2));
	}

}