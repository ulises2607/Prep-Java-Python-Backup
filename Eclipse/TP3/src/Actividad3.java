import java.util.Scanner;
import java.util.ArrayList;
public class Actividad3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float [] vector = new float [10];
		float elemento;
		int indice;
		System.out.println("Ingrese 10 numeros reales:");
		for (int i=0 ; i<10 ; i++) {
			
			System.out.println("Ingrese real "+(i+1));
			elemento = entrada.nextFloat();
			vector [i]= elemento;
			
		}
		System.out.println("el vector ingresado es ");
		for (int i=0 ; i<10 ; i++) {
			System.out.println(vector[i]);
		
			
		}// AHORA SE ELEGIRA EL ELEMENTO EN SU RESPECTIVA POSICION A ELIMINAR
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Disque posicion del elemento a eliminar");
		indice = entrada2.nextInt();
		float x = vector[indice-1];
		System.out.println("El elemento de la posicion "+(indice)+" es "+x);
		

	}

}



