
public class Thanos extends Personajes{
	
		private Gemas [] guantelete;
		private int numGemas;
		
		
	
	
	public Thanos( int puntosSalud, int puntosAtaque, int puntosDefensa) {
			super("Thanos", puntosSalud, puntosAtaque, puntosDefensa);
			this.numGemas = 0;
			this.guantelete = new Gemas[Gemas.values().length];
		}

	public boolean guanteleteCompleto() {
		return this.numGemas == Gemas.values().length;
	}


	@Override
	public boolean esquivar() {
		return false;
	}
	
}
