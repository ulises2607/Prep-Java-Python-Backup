
public class Principal {

	public static void main(String[] args) {
		
		CuentaBancaria cb = new CuentaBancaria();
		System.out.println(cb.CBU + " "+ cb.alias + " " + cb.saldo);
		
		cb.CBU = "32165453115321313515";
		cb.alias = "miCuenta";
		
		cb.mostrarDatos();
		
	}

}
