package Ejercicio6;

public class Taxi {
	private long id;
	private int numeroTaxi;
	protected int tipoDeTarifa;
	protected float precioBajBandera;
	private TarifaTaxi tarifa;
	public Taxi() {
		
	}

	public Taxi(long id, int numeroTaxi, TarifaTaxi tarifa ) {
		
		this.id = id;
		this.numeroTaxi = numeroTaxi;
		this.tarifa = tarifa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumeroTaxi() {
		return numeroTaxi;
	}

	public void setNumeroTaxi(int numeroTaxi) {
		this.numeroTaxi = numeroTaxi;
	}

	
	//mostrar
	
	public void mostrar() {
		System.out.println("Licencia TAXI: "+getId());
		System.out.println("Numero de TAXI: "+ getNumeroTaxi());
		System.out.println("Numero de tarifa: "+ tarifa.getTipoDeTarifa());
		System.out.println("Bajada de bandera: "+ tarifa.precioBajBandera);
	}
	// Cambiar tarifa
	
	public void cambiarTarifa() {
		if (tarifa.getTipoDeTarifa()==1) {
			tarifa.setTipoDeTarifa(2);
		}else if(tarifa.getTipoDeTarifa()==2) {
			tarifa.setTipoDeTarifa(1);
		}
		System.out.println("Cambio de tarifa exitoso");
	}		
	//Calcular total a pagar
	
	public float calcularTotalAPagar(float metros ) {
		float total = 0;
		if (tarifa.getTipoDeTarifa()==1) {
			total = tarifa.getPrecioBajBandera() + (metros * 5);
			return total;
		}else if(tarifa.getTipoDeTarifa()==2) {
			total = tarifa.getPrecioBajBandera() + (metros * 8);
			return total;
		}
		return total;
	}
}



