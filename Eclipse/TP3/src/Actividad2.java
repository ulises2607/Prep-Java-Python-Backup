import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		// Crear array
		
		float[] peso = new float [20];
		float suma = 0;
		for(int i=0 ; i<20 ; i++) {
		System.out.println("Ingrese el peso de la persona "+(i+1));
		float ppersona = entrada.nextFloat();
		
		peso [i]= ppersona;
		
		suma = suma +ppersona;
		}
		
//ORDENAR: MAYOR PESO
		
		float mayor = peso[0];
		for(int i=0 ; i<20 ; i++) {
			
			float numeroActual = peso[i];
			if(numeroActual > mayor) {
				mayor = numeroActual;
			}
			
		}
//ORDENAR: MENOR PESO
		float menor = peso[0];
		for(int i=0 ; i<20 ; i++) {
			
			float numeroActual = peso[i];
			if(numeroActual < menor) {
				menor = numeroActual;
			}
		}
// EL PROMEDIO DE LOS PESO INGRESADOS EN EL ARRAY ES
		
		float promedio = suma/20;
		
// Imprimir si existen personas que pesan mas de 100kg
		for (int i=0 ; i<20 ; i++)
			if (peso[i]>100) {
			float mayor100 = peso[i];
			System.out.println("Esta persona pesa mas de 100kg: " +mayor100);
		}
		
		System.out.println("El peso medio es: "+promedio);
		System.out.println("El mayor peso es:  " +mayor);
		System.out.println("El menor peso es: "+ menor);
	}
}


