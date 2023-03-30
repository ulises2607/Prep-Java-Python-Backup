package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado(4,5);
		float ac = c1.getArea();
		System.out.println(ac);
		
		Circulo cir1 = new Circulo(5);
		System.out.println("El area del circulo es: "+cir1.getArea());
		
		Triangulo t1 = new Triangulo();
		t1.areaTriangulo(2, 5);
		
		Triangulo t2 = new Triangulo();
		t2.areaTriangulo(2, 4);
		
		Figura f1 = new Figura(c1,cir1,t1);		
	}

}
