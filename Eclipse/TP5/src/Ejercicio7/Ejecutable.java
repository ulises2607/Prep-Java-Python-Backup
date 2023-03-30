package Ejercicio7;

public class Ejecutable {

	public static void main(String[] args) {
	Producto p1 = new Producto(1552,"cable 1,5mm","electricidad", 42,1000);

	System.out.println("hay stock?: "+p1.validarStock());
	}

}
