
public class Actividad4 {
	public static void main(String[]args) {
		
		float num1,num2,suma,producto,resta;
		float num3,num4,division;
		num1 = 2;
		num2 = 6;
		num3 = 7;
		num4 = 0;
		
		if (num4!=0) {
			division=num3/num4;
					System.out.println("La division es "+division);
		} else {
			System.out.println("No se puede realizar la operacion, ya que no se puede dividir por 0");
		}
		suma = num1+num2;
		System.out.println("La suma de "+num1+" y "+num2+ " es: "+suma);
				
		resta = num2 - num1;
		System.out.println("La resta entre "+num2+" y "+num1+" es "+resta);
		
		producto=num2*num3;
		System.out.println("el producto entre "+num2+" y el numero "+num3+ " es: "+producto);
	}
}
