package Paquete3;

public class Estatico2 {
	private static String frase = "Primera frase";
	
	public static int sumar(int n1, int n2) {
		int suma = n1 + n2;
		return suma;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(Estatico2.frase);
		System.out.println("La suma es: "+Estatico2.sumar(5,6));

	}

}
