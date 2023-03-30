package Ejercicio3;

public class Tarjeta {

	public static void main(String[] args) {
		
		TCredito JPTarjeta = new TCredito("666","JPerez","BcoPatagonia",2000,10000);
		
		TCredito DMTarjeta = new TCredito("777","DMartin","BcoGalicia",5000,10000);
		
		JPTarjeta.muestraDatos();

	// verificar si se puede comprar ultrabook de 16000
		if(JPTarjeta.puedoComprar(16000)==false) {
			System.out.println("Esta cortina el limite machito");
		}else {
			System.out.println("paseeeeeeeeee");
		}
		
		JPTarjeta.aumentarBalance(2000);
		JPTarjeta.aumentarLimite(20000);
		JPTarjeta.muestraDatos();
		
		if(JPTarjeta.puedoComprar(16000)==false) {
			System.out.println("Esta cortina el limite machito");
		}else {
			System.out.println("paseeeeeeeeee");
		}
		DMTarjeta.pagarTarjeta(1500);
		DMTarjeta.muestraDatos();
	}

}

//a) son nuevos objetos.
//b) en teoria numero de cliente y nombre