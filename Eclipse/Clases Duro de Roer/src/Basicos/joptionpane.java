package Basicos;

import javax.swing.JOptionPane;

// Ejercicio 11 contar cuantas vocales tiene una frase pasada por consola por el usuario
public class joptionpane {
	public static void main(String [] args) {
		
		String texto = JOptionPane.showInputDialog(null,"Escribe una cadena", "Insercion",JOptionPane.INFORMATION_MESSAGE);
		texto = texto.toLowerCase(); //Convertir una cadena en minuscula
		
		char vocales [] = {'a' , 'e' , 'i' , 'o', 'u'};
		
		boolean esVocal;
		
		char caracterActual;
		int contadorVocales=0;
		char vocalesExtraidas [];
		
		for(int i=0;i<texto.length();i++) {
			esVocal=false;
			caracterActual = texto.charAt(i); // charat te extrae un elemento dependiendo la posicion.
			
			for(int j=0;j<vocales.length && !esVocal;j++) {
				
				if(vocales[j]==caracterActual) {
					contadorVocales++;
					esVocal=true;
					
					System.out.println(caracterActual);
					
				}
				
			}
		}
		JOptionPane.showMessageDialog(null, "La frase tiene "+contadorVocales+" vocales", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
