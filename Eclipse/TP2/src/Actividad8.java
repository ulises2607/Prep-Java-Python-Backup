import java.util.Scanner;
public class Actividad8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dada la cantidad de minutos ingresadas se mostraran los segundos que contiene.");
		System.out.println("Ingrese minutos: ");
		float minutos = sc.nextFloat();
		
		float segundos = minutos * 60;
		System.out.println("La cantidad de segundos contenidas en "+minutos+" minutos es: "+segundos);
		
		
	}
}
