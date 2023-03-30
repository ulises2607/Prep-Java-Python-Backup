import java.util.*;
public class Calculadora {

	
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
		//Inicio del programa. 
		
		boolean salir = false;
		while(!salir) {
		System.out.println("**********************************");
		System.out.println("¿Que operacion desea realizar?");
		System.out.println("1) Multiplicacion          2) Division");
		System.out.println("3) Suma                     4) Resta");
		System.out.println("5) No realizar Operacion    6)Salir");
		
		Operaciones resultado = new Operaciones(); //LLAMAMOS AL RESULTADO
		
		//SELECCIONAR OPERACIONES
		int opcion = leer.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Ingrese los 2 numeros a multiplicar");
			float m1 = leer.nextFloat();
			float m2 = leer.nextFloat();
			
			float multiplicacion = resultado.multiplicar(m1, m2);
			
			System.out.println("El resultado de multiplicar "+m1+" y "+m2+" es: "+multiplicacion);
			break;
		
		case 2:
			System.out.println("Ingrese los 2 numeros a dividir con el division distinto de 0");
			float d1 = leer.nextFloat();
			float d2 = leer.nextFloat();
			if (d2==0) {System.out.println("El segundo numero tiene que ser distinto de 0, reintentar");}else {
			
				float division = resultado.dividir(d1,d2);
			System.out.println("El resultado de dividir "+d1+" y "+d2+" es: "+division);
			}
			break;
		
		case 3:
			System.out.println("Ingrese los 2 numeros a sumar");
			float s1 = leer.nextFloat();
			float s2 = leer.nextFloat();
			
			float suma = resultado.sumar(s1, s2);
			
			System.out.println("El resultado de multiplicar "+s1+" y "+s2+" es: "+suma);
			break;
			
		case 4:
			
			System.out.println("Ingreses los 2 numeros a restar");
			float r1 = leer.nextFloat();
			float r2 = leer.nextFloat();
			
			float resta = resultado.restar(r1, r2);
			
			System.out.println("El resultado de restar "+r1+" y "+r2+" es: "+resta);
		
			break;
			
		case 5:
			System.out.println("Intentaremos que volvamos a preugntar");
			break;
			
		case 6:
			salir = true;
			System.out.println("Finished Application");
		}
		}
		
		
	}
	}
