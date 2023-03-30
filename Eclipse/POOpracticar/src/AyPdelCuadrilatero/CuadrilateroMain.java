package AyPdelCuadrilatero;
import java.util.*;
public class CuadrilateroMain {

	public static void main(String[] args) {
		Cuadrilatero c1;
		float lado1,lado2;
Scanner leer = new Scanner(System.in);

	System.out.println("Digite lado 1: ");
lado1 = leer.nextFloat();

	System.out.println("Digite lado 2: ");
lado2 = leer.nextFloat();

if(lado1 == lado2) { // Es un cuadrado
	c1 = new Cuadrilatero(lado1);
}else {
	c1 = new Cuadrilatero(lado1,lado2);
}

System.out.println("El perimetro es: "+c1.getPerimetro());
System.out.println("El area es: "+c1.getArea());
	}

}
