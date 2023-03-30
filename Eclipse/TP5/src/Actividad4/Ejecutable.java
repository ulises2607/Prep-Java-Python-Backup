package Actividad4;

public class Ejecutable {

	public static void main(String[] args) {
		
		Productos [] productos = new Productos[6]; //Creacion Arraylist con 6 productos
		
		productos [0] = new ProdNoPerecedero("Mayonesa",55,30);
		productos [1] = new ProdNoPerecedero("Ketchup",80,30);
		
		
		System.out.println("Las 5 mayonesas salen: "+productos[0].getPrecio());
		System.out.println("* Total a pagar: "+productos[0].calcular(5));
		
		
	}
	

}
