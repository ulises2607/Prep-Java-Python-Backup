package Ejercicio6;

public class TarifaTaxi{
	public int tipoDeTarifa;
	public float precioBajBandera;
	
	public TarifaTaxi(int tipoDeTarifa, float precioBajBandera) {
		this.precioBajBandera = precioBajBandera;
		this.tipoDeTarifa = tipoDeTarifa;
	}
	public int getTipoDeTarifa() {
		return tipoDeTarifa;
	}
	public float getPrecioBajBandera() {
		return precioBajBandera;
	}
	public void setPrecioBajBandera(float preciobandera) {
		this.precioBajBandera = preciobandera;
	}
	public void setTipoDeTarifa(int tipodetarifa) {
		this.tipoDeTarifa = tipodetarifa;
		switch(tipodetarifa) {
		case 1:
			setPrecioBajBandera(58);
		break;
		case 2:
			setPrecioBajBandera(70);
			break;
			
		}
	}
}
