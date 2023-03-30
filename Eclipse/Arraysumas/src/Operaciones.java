
public class Operaciones {
	public float num1;
	public float num2;
	

	
	public float sumar(float a,float b) {
		float suma = a + b;
		return suma;
	}
	public float restar(float num1,float num2) {
		float resta = num1 - num2;
		return resta;
	}
	public float dividir(float num1, float num2) {
		float division ;
		if(num2!=0) {
			 division = num1 / num2;
			return division;
		}else {
		return division = Float.parseFloat("No se admite la division por 0");
		}
	}
	public float multiplicar(float num1, float num2) {
		float multiplicacion = num1 * num2;
		return multiplicacion;
	}
}
