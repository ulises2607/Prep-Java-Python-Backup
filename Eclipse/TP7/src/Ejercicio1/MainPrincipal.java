package Ejercicio1;

import java.io.ByteArrayInputStream;

public class MainPrincipal {

	public static void main(String[] args) {
		
		byte [] array = {0,1,2,3,4,5,6,7,8,9};
		
		ByteArrayInputStream flujoArray = new ByteArrayInputStream(array);
		
		while(flujoArray.available() != 0) {
			byte numero = (byte) flujoArray.read();
			System.out.println(numero+",");
		}

	}

}
