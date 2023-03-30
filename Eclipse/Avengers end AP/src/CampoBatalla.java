
public class CampoBatalla {
	
	private Thanos thanos;
	private Avenger [] avengers;
	
	private boolean turno;
	
	public CampoBatalla() {
		
		thanos = new Thanos(200000,300,500);
		
		Avenger [] avengers = {
				
		                    new AvengerFisico("Capitan America",5000,800,600),
		                    new AvengerFisico("Hulk",10000,1500,1000),
		                    new AvengerApoyo("Doctor Strange",2000,200,500),
		                    new AvengerDistancia("Iron Man", 3000, 300,500),
		                    new AvengerFisico("Ant man",3000,600,600),
		                    new AvengerDistancia("Hawkeye",2000,400,500),
		                    new AvengerDistancia("War Machine",4000,400,300),
		                    new AvengerDistancia("Rocket",500,600,100)
		                    
		                    
		};
		this.avengers = avengers;
		
		this.turno = true; //true = thanos, false = avengers
	}
	
	public boolean endApp() {
		return !this.thanos.estaVivo() || this.thanos.guanteleteCompleto() ||this.avengersCaidos(); 
	}
	
	public boolean avengersCaidos() {
		
		for (int i = 0; i<this.avengers.length; i++) {
			if(avengers[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	public void cambiaTurno() {
		this.turno = !turno;
	}
	
	public void resultados() {
		
		if(!this.thanos.estaVivo()) {
			System.out.println("Thanos ha caido");
		}else if(this.thanos.guanteleteCompleto()) {
			System.out.println("Thanos hace su chasquido y todos mueren");
		}else {
			System.out.println("Avengers han caido en combate");
		}
	}
	
	public void combate() {
		
		if(this.turno) {//thanos
			
			if(Metodos.cumpleProbabilidad(50)) {
				this.thanos.atacar(this.avengerAleatorio());
			}
			
		}else {//Avengers
			
			for(int i = 0 ; i<this.avengers.length ; i++) {
				if(this.avengers[i] != null) {
					avengers[i].regenerarValor();
				}
			}
			
		}
	}

	public Avenger avengerAleatorio() {
		
		
		
		int indiceAleatorio = 0;
		do {
			indiceAleatorio = Metodos.generaNumeroAleatorio(0, this.avengers.length -1);
			
		}while(this.avengers[indiceAleatorio] == null);
		
		return this.avengers[indiceAleatorio];
	}
	
}
