package Actividad2;

public class MainCuenta {

	public static void main(String[] args) {
	
		Cuenta cuenta1 = new Cuenta("Ulises",0);
		
		cuenta1.mostrar();
		
		cuenta1.ingresar(5000);
		cuenta1.ingresar(10000);
		cuenta1.ingresar(-55);
		System.out.println("en la cuenta hay: "+cuenta1.getCantidad());
		
		cuenta1.retirar(16000);
		
		System.out.println("En la cuenta hay: "+cuenta1.getCantidad());
	}

}
