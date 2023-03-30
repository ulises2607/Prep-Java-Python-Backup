import java.util.ArrayList;
import java.util.Scanner;
public class ARRAY4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cant=0,elemento=0,suma=0,promedio=0;
		//Crearemos primero el arraylist
		ArrayList<Integer> edad = new ArrayList<>();
		System.out.println("Cuantas edades desea ingresar");
		cant=sc.nextInt();
		if (cant>0) {
			
			for (int i=1 ; i<(cant+1) ; i++ ) {
				System.out.println("Ingrese elemento "+i);
				//Ingresar elemento
				elemento = sc.nextInt();
				//agregar elemento ingresado
				edad.add(elemento);
				//suma de elementos
				suma = suma+elemento;
			}
			//
			
			//Promedio
			promedio=suma/cant;
			System.out.println("Lista de edades: "+edad);
			System.out.println("La suma de los elementos es: "+suma);
			System.out.println("El promedio de las edades ingresadas es: "+promedio);
			
		}
			
			
	}
			
			
}
	


