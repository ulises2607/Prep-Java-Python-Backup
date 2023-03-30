import java.util.Scanner;
public class ACTIVIDAD13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println("Ingrese los k para definir el intervalo a analizar la tenencia de numeros naturales pares: ");
		k = sc.nextInt();
		System.out.println("Como vamos a analizar numeros naturales, k nunca sera negativo, ");
		if (k>1) {
			
			for(int i=1;i<k;i++) {
				
				if (i%2==0) {
				
					System.out.println("el numero "+i+" es par");
		
				}
			}			
		}

	}

}
