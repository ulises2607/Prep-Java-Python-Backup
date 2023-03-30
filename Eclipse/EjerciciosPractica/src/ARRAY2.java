import java.lang.reflect.Array;
import java.util.Scanner;
public class ARRAY2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Se ingresara el tamaño del vector
		System.out.println("Ingrese tamaño del vector ");
		int tamanov = sc.nextInt();
		//INTENTAR ARMAR EL VETOR
		int [] vector = new int [tamanov];	
		for (int i=0;i<tamanov;i++) {
		
			
		System.out.println("Ingrese elemento "+(i+1)+" del vector");
		vector[i]=sc.nextInt();
		
		
		}
		System.out.println("El vector ingresado esta compuesto por");
			for(int vec:vector) {
		System.out.println(vec);
		
	
			}	int x = (int) Array.get(vector,3);
			System.out.println("El elemento seleccionado en la posicion 3 es: "+x);
		


		}

		

	}


