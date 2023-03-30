package Ejercicio2;

public class Cuadrado extends Figura{
	private float base;
	private float altura;
	
	
	public Cuadrado(float base, float altura) {
		this.base=base;
		this.altura=altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getArea() {
		if(this.altura == this.base) {
		float area = this.altura * this.base;
		return area;
		}else {
			System.out.println("no es un cuadrado, es un cuadrilatero con area: ");
			
		}
		float areaCuadrilatero = getBase()*getAltura();
		return areaCuadrilatero;
	}
}
