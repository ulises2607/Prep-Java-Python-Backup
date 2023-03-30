import java.util.Scanner;
public class DecidirPrimo {
	public static boolean esPrimo(int n) {
		if(n<=1)
			return true;
		else if(n == 2)
			return true;
		else {
			for (int i=2;i<n;i++) {
				if (n % i == 0)
					return false;
			}return true;
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero que desea saber si es Primo");
		
		int numero = sc.nextInt();
		if (esPrimo(numero) == true) {
		System.out.println("El numero "+numero+ " es un numero primo");
		}else {
			System.out.println("El numero "+numero+" no es un numero primo");
		}
		return;
	}

}
