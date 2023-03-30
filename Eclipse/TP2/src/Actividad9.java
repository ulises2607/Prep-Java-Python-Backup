import java.util.Scanner;
public class Actividad9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero 1");
		int num1 = sc.nextInt();
		
		System.out.println("Ingrese numero 2");
		int num2 = sc.nextInt();
		
		System.out.println("Ingrese numero 3");
		int num3 = sc.nextInt();
		
		if (num1 != num2 && num1 != num3 && num2 != num3) {
			
			if (num1 < num2 && num1 < num3 && num2 < num3 ) {
				System.out.println("Los numeros de menor a mayor son: "+num1+" el "+num2+" y el "+num3);
			}
			if (num1<num2 && num1<num3 && num3<num2) {
				System.out.println("Los numeros de menor a mayor son "+num1+" el "+num3+" y el "+num2);
			}
			if (num2 < num1 && num2 < num3 && num1<num3 ) {
				System.out.println("Los numeros de menor a mayor son: "+num2+" el "+num1+" y el "+num3);	
			}
			if (num2<num1 && num2<num3 && num3<num1) {
				System.out.println("Los numeros de menor a mayor son "+num2+" el "+num3+" y el "+num1);
			}
			if (num3< num1 && num3<num2 && num2<num1) {
				System.out.println("Los numeros de menor a mayor son "+num3+" el "+num2+" y el "+num1);
			}
			if (num3<num1 && num3<num2 && num1<num2) {
				System.out.println("Los numeros de menor a mayor son "+num3+" el "+num1+" y el "+num2);
			}
			
				} else {
			System.out.println("Existen numeros iguales, intentar con otros valores");
		}
		
		}
		
		
	}
