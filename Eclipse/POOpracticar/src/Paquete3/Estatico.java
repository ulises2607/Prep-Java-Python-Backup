//Miembros estaticos de una clase
package Paquete3;

public class Estatico {
	//poner static hace que el atributo solo pertenerzca a la clase,
	//ya no a los objetos.
	//Si cambio el objeto se cambia para todos.
	private static String frase = "Primera frase";
	public static void main(String[] args) {
		Estatico ob1 = new Estatico();
		Estatico ob2 = new Estatico();
		
		ob2.frase = "Segunda frase";
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);

	}
	

}
