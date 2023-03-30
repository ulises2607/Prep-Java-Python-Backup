import java.util.Scanner;

public class ACTIVIDAD11 {

	public static void main(String[] args) {
			System.out.println("Se determinara, segun los lados ingresados de un triangulo, si es isosceles, equilatero o escaleno");	
				Scanner sc2 = new Scanner(System.in);
		
				System.out.println("Ingrese lado 1");
			int lado1 = sc2.nextInt();
			System.out.println("Ingrese Lado 2");
			int lado2 = sc2.nextInt();
			System.out.println("Ingrese Lado 3");
			int lado3 = sc2.nextInt();
			if (lado1>0 && lado2>0 && lado3>0) {
			System.out.println("Los lados ingresados son "+lado1+", "+lado2+" y "+lado3);
			
			if (lado1==lado2 && lado2==lado3 && lado1==lado3) {
				
				System.out.println("El triangulo es equilatero");
				
			}
			if (lado1!=lado2 && lado2==lado3 || lado2!=lado1 && lado1==lado3 || lado3!=lado1 && lado1==lado2 || lado3!=lado2 && lado2==lado1) {
				
				System.out.println("El triangulo es isosceles");
				
			}if (lado1!=lado2 && lado2!=lado3) {
				
				System.out.println("El triangulo es escaleno");
			}
			}else {
				System.out.println("El numero ingresado es incorrecto, solo se permiten numeros naturales");
			}	}

}
