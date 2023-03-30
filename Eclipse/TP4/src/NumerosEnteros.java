
public class NumerosEnteros {
//Definir los atributos
	//M.A. Modificadores de Acceso
	public int num1;

	public NumerosEnteros(int num1) {
		this.num1 = num1;
	}
	public int sumar(int  parametro) {
	int suma = num1 + parametro;
	return suma;
	}
	public int restar(int parametro) {
	int restar = num1 - parametro;
	return restar;
	}
	public int multiplicar(int parametro) {
	int multiplicar = num1 * parametro;
	return multiplicar;
	}
	public int dividir( int parametro) {
		if(parametro!=0) {
			int dividir = num1 / parametro;
			return dividir;
		}else {
			System.out.println("No se puede dividir por 0, elija otro parametro");
			int dividir = ;
		return  dividir;
		}
	}
}

