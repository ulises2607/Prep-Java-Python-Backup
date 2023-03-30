import java.util.Scanner;
public class Actividad6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de datos para promediar:");
		
		float sumatoria =0;
		float cant = sc.nextFloat();
		
		for(int i=0 ; i<cant ; i++) {
		System.out.println("Ingrese numero/dato "+(i+1));
			Scanner sc2 = new Scanner(System.in);	
			float num = sc2.nextFloat();
			
			 sumatoria = sumatoria + num;
			
		}
		float promedio = sumatoria/cant;
		System.out.println("EL PROMEDIO ES "+promedio);
	}
}
