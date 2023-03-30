package Test;

public class main {

	public static void main(String[] args) {
		
		int x = mi_funcion(3,1);
		
		//int x = funcion2(2);
		
		System.out.println("resultado: " + x);

	}

	static int mi_funcion(int param1, int param2) {
		int contador = 0;
		int resultado= 1;
		
		while(contador < param2){
			resultado = resultado * param1;
			contador = contador + 1;
		}
		return resultado;
	}
	static int funcion2 (int numero) {
		if(numero == 0) {
			return 1;
		}else {
			return numero * funcion2(numero-1);
		}
	}
}
