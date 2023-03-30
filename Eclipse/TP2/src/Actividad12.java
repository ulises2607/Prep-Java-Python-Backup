import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sumatoria= 0;
		System.out.println("Ingrese cantidad de deportistas");
		int deportistas = sc.nextInt();
		
		//Se analizara el promedio de edad de los deportistas.
		for (int i=0 ; i<deportistas ; i++) {
			System.out.println("Ingrese edad: ");
			float edad = sc.nextFloat();
		sumatoria= sumatoria + edad;
		
		}
		float promedioedad= sumatoria/deportistas;
		System.out.println("el promedio de edad, en base a la cantidad de deportistas seleccionada, es: "+promedioedad);
		
	}

}
