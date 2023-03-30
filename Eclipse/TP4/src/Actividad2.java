import java.util.*;
public class Actividad2 {

	public static void main(String[] args) {
		//LLmar a nuestr clase
		Scanner sc = new Scanner(System.in);
		System.out.println("INGRESE SERIE");
		
		System.out.println("Ingrese nombre de la serie");
			String n = sc.nextLine();
		System.out.println("Ingrese Cantidad de temporadas ");
			int t = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese el Genero de la serie");
			String g = sc.nextLine();
		System.out.println("Ingrese el creador de la serie");
			String c = sc.nextLine();
		
				
		Serie nuevaSerie = new Serie(n, t, g, c);
		
		nuevaSerie.mostrar();
		
		
		
		}		
	}


