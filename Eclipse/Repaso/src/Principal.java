
public class Principal {

	public static void main(String[] args) {
		
		//Llamar al molde (clase), darle un nombre, constructor
		//color, marca, año.
		Extintor objetoExtintor = new Extintor("B","05/05/2022", 12);
		
		Auto objetoAuto = new Auto("blanco","chevrolet", 2016 , objetoExtintor);
		
		System.out.println(objetoAuto.color);
		System.out.println(objetoAuto.matafuegos.tipo);

	}

}
