package Basicos;

import javax.swing.JOptionPane;

// Eliminar los espacios de una frase pasada por consola por el usuario.
public class Ejercicio12 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog(null, "Escriba una cadena: ", "Ingresar",JOptionPane.INFORMATION_MESSAGE);
		
		char caracterActual;
		String texto_sin_espacios = "";
		
		for(int i=0;i<texto.length();i++) {
			
			caracterActual = texto.charAt(i);
			
			if(caracterActual != ' ') {
				
				texto_sin_espacios+=caracterActual;
				
			}
		}
		JOptionPane.showMessageDialog(null, texto_sin_espacios, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
