import java.util.Scanner;
public class Actividad5 {
	public static void main(String[]args) {
		Scanner scant = new Scanner(System.in);
		System.out.println("Ingrese cantidad de valores a analizar");
		int cant = scant.nextInt();
		for (int i= 0;i<cant;i++) {
		System.out.println("Ingrese cual es el numero de orden "+(i+1)+" al que quiere saber su paridad");
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		if(num1%2 == 0) {
			System.out.println("El numero "+num1+" es PAR");
		}else {
			System.out.println("El numero "+num1+" es IMPAR");
		}
		}
	}
}
