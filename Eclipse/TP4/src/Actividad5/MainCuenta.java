package Actividad5;
import java.util.*;
public class MainCuenta {

	public static void main(String[] args) {
		int num_cuentas;
		Scanner leer = new Scanner(System.in);
	
		
		Cuenta cuenta1 = new Cuenta("Ulises Cappa", "0001",0,5000);

		Cuenta cuenta2 = new Cuenta("Barby Segura","0002",0,10000);
		
		cuenta1.ingreso(3000);
		System.out.println("Saldo cuenta 1 es:"+cuenta1.getSaldo());
		
		cuenta1.transferencia(cuenta2, 300);
		
		System.out.println("Saldo de cuenta 1 es "+cuenta1.getSaldo());
		
		System.out.println("Saldo de cuenta 2 es "+cuenta2.getSaldo());
	}


	

}
