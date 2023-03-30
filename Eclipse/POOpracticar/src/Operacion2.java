import java.util.Scanner;
public class Operacion2 {

	// Atributos

	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	
	//METODO: Acciones a realizar en la clase operacion, en este caso.
	
	//Metodo para pedirle al usuario que nos digite 2 numeros
	

	public void sumar(int numero1,int numero2) {
		suma = numero1+numero2;
		
	}
	public void restar(int numero1,int numero2) {
		resta = numero1-numero2;
		
	}
	public void multiplicar (int numero1,int numero2) {
		multiplicacion = numero1*numero2;
		
	}
	public void dividir(int numero1,int numero2) {
		if(numero2!=0) {
		division = numero1/numero2;
		}
	}
	public void mostrarResultados() {
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La resta de los numeros es: "+resta);
		System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
		System.out.println("La division de los numeros es: "+division);
	}
}