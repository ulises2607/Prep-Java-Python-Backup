import javax.swing.JOptionPane;

public class Pruebacharat {
	public static void main(String []args) {
		String texto = JOptionPane.showInputDialog(null,"Escribe una cadena", "Insercion",JOptionPane.INFORMATION_MESSAGE);
		texto = texto.toLowerCase(); //Convertir una cadena en minuscula
		
		char vocales [] = {'a' , 'e' , 'i' , 'o', 'u'};
		
		boolean esVocal;
		
		char caracterActual;
		int contadorVocales=0;
		
		for(int i=0;i<texto.length();i++) {
			esVocal=false;
			caracterActual = texto.charAt(i);
			
			System.out.println(caracterActual);
			System.out.println(vocales[i]);
		}
		
	}
}
