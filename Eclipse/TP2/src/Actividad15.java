
public class Actividad15 {

     public static boolean esPrimo(int n) {
	// Divisible entre el mismo y 1 unicamente
	
	if (n <= 1)
		return false;
	else if (n == 2)
		return true;
	
	else {
		
		for(int i=2;i<n;i++) {
			if (n % i == 0)
				return false;
		}
	}
	return true;
}
	
	public static void main(String[] args) {
		
		for (int i=-10;i<=100;i++) {
			if(esPrimo(i)== true) {
				System.out.println(i+" es Primo");
			}
			else {
				System.out.println(i+" no es Primo");
			} 
		}
	}

}
