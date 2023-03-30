package Clases;
import java.util.*;
public class Primera {
	public static void main(String []args) {
		int resultado= 0 ;
		
		resultado = mi_funcion(3,0);
		
		System.out.println("El resultado es: "+resultado);
		
		
	}
	static int mi_funcion(int param1,int param2) {
		int contador = 0;
		int resultado = 1;
		while(contador < param2) {
			resultado = resultado * param1;
			contador = contador +1;
		}
		return resultado;
	}
	static int segunda_funcion(int numero) {
		if(numero == 0) {
			return 1;
		}else {
			return numero * segunda_funcion(numero - 1);
		}
}
	
}
