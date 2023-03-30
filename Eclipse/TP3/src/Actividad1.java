import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		//llamar la funcion Scanner
		Scanner sc = new Scanner(System.in);
		//Pedir cantidad de elementos que se desearan ingresar en el array
		
		System.out.println("Ingrese cantidad de elementos deseados para el array");
		int cArray = sc.nextInt();
		int [] vector = new int[cArray];	
		
		//Ahora que ya sabemos la cantidad de elementos se pediran los mismos uno a uno
		System.out.println("Ahora ingresaremos los elementos del array");
		for(int i=0; i<cArray ; i++) {
			System.out.println("Ingrese el elemento: "+(i+1));
		int elemento = sc.nextInt();
		vector[i]= elemento;
			
		
		}
		System.out.println("El array creado es: ");
		for (int i=0 ; i<cArray ; i++) {
			
			System.out.println(vector[i]);
		}
	}


}