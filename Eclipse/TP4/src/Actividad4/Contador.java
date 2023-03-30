package Actividad4;

public class Contador {
	public int cont;

	public Contador(int cont) {
		this.cont = cont;
		
	}
	public void mostrar() {
		System.out.println("Iniciamos el contador en: "+this.cont);
	}
	public int getIncremento(int cont) {
		int incremento = cont++;
		return incremento;
	}
	public int getDecremento(int cont) {
		if (cont<0) {
			int decremento = 0;
		}else {
			int decremento = cont--;
			return decremento;
		}
		return cont--;
		
	}
}

