package Actividad2;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta (String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	//Getters y Setters
	public String getTitular() {
		return titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setTitular(String t) {
		this.titular = t;
	}
	public void setCantidad(double c) {
		this.cantidad = c;
	}
	//Metodo Mostrar datos
	public void mostrar() {
		System.out.println("Nombre titular: "+titular);
		System.out.println("Cantidad en la cuenta: "+cantidad);
	}
	//Metodo de Ingreso
	
	public boolean ingresar(double c) {
		boolean ingreso = true;
		if(c<0) {
			ingreso = false;
		}else {
			cantidad = cantidad + c;
			
		}
		return true;
		}
	public boolean retirar(double r) {
		boolean retirar = true;
		if(r<0) {
			retirar = false;
		}else {
			cantidad = cantidad - r;
			
		}
		return retirar;
	}
}
