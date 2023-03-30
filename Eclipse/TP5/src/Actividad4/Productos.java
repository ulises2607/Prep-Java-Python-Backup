package Actividad4;

public class Productos {
// Atributos
	public String nombre;
	public double precio;
	public int vencimiento;
	
	
	public Productos(String nombre, double precio, int vencimiento) {
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecios(double precio) {
		this.precio = precio;
	}


	public int getVencimiento() {
		return vencimiento;
	}


	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}


	public double calcular(int cantidad) {
		double calcular = precio * cantidad;
		setPrecios(calcular);
		return calcular;
	}
	
	
	

	
}
