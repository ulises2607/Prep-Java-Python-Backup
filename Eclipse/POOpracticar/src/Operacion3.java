
public class Operacion3 {
	public int sumar(int numero1,int numero2) {
		int suma = numero1+numero2;
		return suma;
	}
	public int restar(int numero1,int numero2) {
		int resta = numero1-numero2;
		return resta;
	}
	public int multiplicar (int numero1,int numero2) {
		int multiplicacion = numero1*numero2;
		return multiplicacion;
	}
	public int dividir(int numero1,int numero2) {
		if(numero2!=0) {
		int division = numero1/numero2;
		return division;
		}
		
	}
	public void mostrarResultados(int suma, int resta, int multiplicacion, int division) {
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La resta de los numeros es: "+resta);
		System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
		System.out.println("La division de los numeros es: "+division);
	}
}