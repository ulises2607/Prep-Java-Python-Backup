
public abstract class Avenger extends Personajes{
	
	public int valor;
	
	public Avenger(String nombre, int puntosSalud, int puntosAtaque, int puntosDefensa) {
		super(nombre, puntosSalud, puntosAtaque, puntosDefensa);
		regenerarValor();
	}

	public void regenerarValor() {
		this.valor = Metodos.generaNumeroAleatorio(1, 20);
	}
	
	
}
