package Actividad4;

public class ProdNoPerecedero  extends Productos{
	
	public ProdNoPerecedero(String nombre,double precio,int cantidad ) {
		super(nombre,precio,cantidad);
		
	}
// getter y setters ya estan definidos en la clase producto.
	
	public double calcular(double cantidad_productos) {
	System.out.println("No perecedero");
	double fin = getPrecio() * cantidad_productos;
	return fin;

	}
}
