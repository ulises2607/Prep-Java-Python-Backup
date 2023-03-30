package Basicos;

import javax.swing.JOptionPane;
// PARA HACER DE UNA MANERA MUCHO MAS FACIL SE USA UPPERCASE Y LOWER CASE PARA MAYYS Y MINUS RESPECTIVAMENTE
public class Ejercicio14 {

	public static void main(String[] args) {
		String texto=JOptionPane.showInputDialog(null,
								"Por favor, introduce una frase",
								"Introduce tu frase",
								JOptionPane.INFORMATION_MESSAGE);
//True = mayus , false no es mayus
		boolean isMayus;
		final int DIFERENCIA = 32;

	/*int eleccion = JOptionPane.showConfirmDialog(null, "Quieres que se pase a mayusculas? ",
											"Eleccion",
											JOptionPane.YES_NO_OPTION);
*/

		String [] opciones = {
				"Mayusculas","Minusculas"};
	
	String cadenaResultante="";
	
	
	int eleccion = JOptionPane.showOptionDialog(null,"Elige tu opcion","Eleccion"
			, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE
			, null, opciones, opciones[0]);
	
	isMayus=eleccion==JOptionPane.YES_NO_OPTION;
	
	char caracterActual;
	
	for(int i=0;i<texto.length();i++) {
		
		caracterActual=texto.charAt(i);
		
		if(isMayus) {
			
			if (caracterActual >=97 && caracterActual<=122){
				
				cadenaResultante+=(char)(caracterActual-DIFERENCIA);
				
			}else {
				cadenaResultante+=caracterActual;
			}
		}else {
			if(caracterActual>=65 && caracterActual<=90) {
				
				cadenaResultante+=(char)(caracterActual+DIFERENCIA);
				
			}else {
				cadenaResultante+=caracterActual;
			}
		}
	}
	
	JOptionPane.showInternalMessageDialog(null,
										cadenaResultante,
										"Resyultado",
										JOptionPane.INFORMATION_MESSAGE);
	}

}
