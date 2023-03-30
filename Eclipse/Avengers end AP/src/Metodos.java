
public class Metodos {

	/**
	 * Genera un numero aleatorio entre dos numeros. Entre el minimo y el maximo incluidos
	 * 
	 * @param minimo Numero minimo
	 * @param maximo Numero maximo
	 * @return Numero entre menimo y maximo
	 */
	
	public static int generaNumeroAleatorio(int minimo, int maximo) {
		int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}
	
	
	public static boolean cumpleProbabilidad(int probabilidad) {
		
		int numero = generaNumeroAleatorio(1,100);
		
		return numero <= probabilidad;
		
	}
}
