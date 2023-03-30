package Actividad1;
import java.util.*;
public class FuncionCuadratica {

	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	System.out.print("Ingresar coeficiente cuadratico:");
	double a = leer.nextDouble();
	System.out.print("Ingresar coeficiente lineal: ");
	double b = leer.nextDouble();
	System.out.print("Ingresar c: ");
	double c = leer.nextDouble();
	
	Raices c1 = new Raices(a,b,c);
	//Analisis unica solucion
	System.out.println("Tiene unica raiz: "+c1.tieneRaiz());
	
	//Analisis 2 raices
	System.out.println("Tiene 2 raices: "+c1.tieneRaices());
	
	//Analisis sin solucion
	
	
	System.out.println("El discriminante es: "+c1.getDiscriminante());
	
	if(c1.tieneRaices()==true) {
		
		double raiz1 = (-(c1.getB())+Math.sqrt(c1.getDiscriminante()))/(2*c1.getA());
		
		System.out.println("Raiz 1: "+raiz1);
		
		double raiz2 = (-(c1.getB())-Math.sqrt(c1.getDiscriminante()))/(2*c1.getA());
		
		System.out.println("La Raiz 2: "+raiz2);
	}else if (c1.tieneRaiz()) {
		
		double raizdoble = (-(c1.getB())+Math.sqrt(c1.getDiscriminante()))/(2*c1.getA());
		
		System.out.println("Raiz doble: "+raizdoble);
	}else {
		System.out.println("La ecuacion no tiene raices reales");
		}
		
	}

}
