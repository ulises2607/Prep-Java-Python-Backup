package Actividad5;
//Procedimiento basico
public class Cuenta {
	String nombre_cliente;
	String numero_cuenta;
	double tipo_interes;
	double saldo;
	// Constructor por defecto
	public Cuenta() {
		
	}
	//Constructor con parametros
	public Cuenta(String nombre_cliente, String numero_cuenta, double tipo_interes, double saldo) {
		this.nombre_cliente = nombre_cliente;
		this.numero_cuenta = numero_cuenta;
		this.tipo_interes = tipo_interes;
		this.saldo = saldo;
	}
	//Constructor copia
	public Cuenta(final Cuenta c) {
		nombre_cliente = c.nombre_cliente;
		numero_cuenta = c.numero_cuenta;
		tipo_interes = c.tipo_interes;
		saldo = c.saldo;
		
	}
	

	//Getters y setters
	public void setNumeroCliente(String ncl) {
		nombre_cliente= ncl;
	}
	public void setNumeroCuenta(String ncu) {
		numero_cuenta = ncu;
	}
	public void setTipoInteres(double ti) {
		tipo_interes = ti;
	}
	public void setSaldo(double s) {
		saldo = s;
	}
	public String getNombreCliente() {
		return nombre_cliente;
	}
	
	public String getNumeroCuenta() {
		return numero_cuenta;
	}
	public double getTipoInteres() {
		return tipo_interes;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	//Metodo Ingreso
	public boolean ingreso(double s) {
		boolean ingresoCorrecto = true;
		if(s<0) {
			ingresoCorrecto = false;
		}else  {
			saldo = saldo + s;
		}
		return ingresoCorrecto;
	}
	//Metodo Reintegro
	public boolean reintegro(double s) {
		boolean reintegroCorrecto = true;
		if(s<0) {
			reintegroCorrecto = false;
		}else if (saldo >= s) {
			saldo -= s;
		}else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}
	
	//Metodo Transferencia
	
	public boolean transferencia(Cuenta c, double s) {
		boolean correcto = true;
		if(s<0) {
			correcto = false;
		}else if (saldo >=s) {
			reintegro(s);
			c.ingreso(s);
		}else {
			correcto = false;
		}
		return correcto;
	}

}
