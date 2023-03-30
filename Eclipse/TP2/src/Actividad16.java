import java.util.Scanner;
public class Actividad16 {
	// Dado un numero natural n mostrar sus digitos indivudualmente.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero natural a analizar");
		
		int numero = sc.nextInt();
		
		if (numero>0) {
			
			if (numero % 2 == 0) {
				
				System.out.println("El numero ingresado es par");
			}else {
				System.out.println("El numero ingresado es impar");
			}
		}
		System.out.println("Ahora se analizara la paridad del numero ingresado");
		String cadena = String.valueOf(numero); //convertir el numero en una cadena tipo String para poder separar los digitos
			for (int i=0 ; i<cadena.length() ; i++)	{
		char p = cadena.charAt(i); //Accedemos a la posicion de la variable tipo Char
		 int    n=Character.getNumericValue(p); // Interesante funcionalidad la del getNumericValue() ya que accedemos a la numerica del caracter
				
				
		 if (i<(cadena.length()) && n % 2 == 0){
			 System.out.println("El digito " + n + " es par");
		 }else {
			 System.out.println("El digito " + n + " es impar");
		 }
			
		}
			
	}
}


