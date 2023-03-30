package Ejercicio2;

public class Triangulo extends Figura{
	private float base;
	private float altura;
	
	public Triangulo() {
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
	
	public void areaTriangulo(float p1,float p2) {
		this.base = p1;
		this.altura = p2;
		float area = (p1*p2)/2;
		System.out.println("El area del triangulo es: " +area);
	}
}
