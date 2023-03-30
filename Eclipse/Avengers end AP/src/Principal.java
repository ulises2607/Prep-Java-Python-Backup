
public class Principal {

	public static void main(String[] args) {
		
		
		CampoBatalla campo = new CampoBatalla();
		
		while(!campo.endApp()) {
			
			campo.combate();
			
			campo.cambiaTurno();
			
			
		}
		
		campo.resultados();
		
	}

}
