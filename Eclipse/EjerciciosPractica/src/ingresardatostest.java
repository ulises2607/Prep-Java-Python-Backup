import java.util.Scanner;
public class ingresardatostest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese Apellido");
		String Apellido = sc.nextLine();
		
		System.out.println("Ingrese Edad");
		int edad = sc.nextInt();
		
		System.out.println("Ingrese DNI");
		int dni = sc.nextInt();
		
		
		System.out.println("Sus datos ingresados son");
		System.out.println("Nombre y Apellido: "+nombre + " "+ Apellido);
		System.out.println("Edad: "+ edad);
		System.out.println("D.N.I: "+dni);
		
	}
}
