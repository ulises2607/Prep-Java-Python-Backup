import  java.util.*;
public class Operacion {

	// Atributos
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	
	//METODO: Acciones a realizar en la clase operacion, en este caso.
	
	//Metodo para pedirle al usuario que nos digite 2 numeros
	
	public void leerNumeros() {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite numero 1");
		numero1 = leer.nextInt();
		System.out.println("Digite numero 2");
		numero2 = leer.nextInt();
		
	}
	public void sumar() {
		suma = numero1+numero2;
		
	}
	public void restar() {
		resta = numero1-numero2;
		
	}
	public void multiplicar () {
		multiplicacion = numero1*numero2;
		
	}
	public void dividir() {
		if(numero2!=0) {
		division = numero1/numero2;
		}else {
			System.out.println("El numero 2 debe ser distitno de 0 para poder realizar la division");
		}
	}
	public void mostrarResultados() {
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La resta de los numeros es: "+resta);
		System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
		System.out.println("La division de los numeros es: "+division);
	}
}
