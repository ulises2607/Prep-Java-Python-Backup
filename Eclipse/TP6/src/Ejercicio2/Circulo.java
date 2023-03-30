package Ejercicio2;

public class Circulo extends Figura {
	private double radio;
	
	
	public Circulo(double radio) {
		this.radio=radio;
		
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		double area = Math.PI*(getRadio()*getRadio());
		return area;
		
	}
	
}