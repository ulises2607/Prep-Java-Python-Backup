
public class Principal {
	public static void main(String[]args) {
		//Creamos una clase Persona, constructor
		
		Mascota gato = new Mascota("DonGato","Blanco y Negro");
		Persona tarjeta1= new Persona("Ulises",31,gato);
		
		System.out.println("El nombre de la persona es "+tarjeta1.nombre);
		System.out.println("tiene "+tarjeta1.edad+" años");
		System.out.println("----------");
		System.out.println("El nombre de la mascota es "+tarjeta1.mascota.nombre);
		System.out.println("y es de color "+tarjeta1.mascota.getColor());
	}
}
