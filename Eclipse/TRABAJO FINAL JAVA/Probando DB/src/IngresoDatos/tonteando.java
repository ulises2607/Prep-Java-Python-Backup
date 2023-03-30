package IngresoDatos;

public class tonteando {

	public static void main(String[] args) {


		try {
			int x = funcion(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int funcion (int numero) {
		if(numero == 0) {
			return 1;
		}else {
			return numero * funcion(numero-1);
		}
	}
	
}
