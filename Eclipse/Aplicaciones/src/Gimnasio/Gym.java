package Gimnasio;

import java.util.ArrayList;



public class Gym {
	private String nombreGym;
	private String Moderador;
	private String Password;
	private ArrayList <Cliente> cliente;
	
	public Gym (String nombreGym, String Moderador, String Password) {
		this.nombreGym = nombreGym;
		this.Moderador = Moderador;
		this.Password = Password;
		this.cliente = new ArrayList<>();
	}
	
	public String getNombreGym() {
		return nombreGym;
	}
	
	public void cambiarPass(String passnueva) {
		
		// Falta poner condicion y verificacion del usuario.
		
		this.Password = passnueva;
	}
	
	public void agregarCliente(Cliente cli) {
		this.cliente.add(cli);
	}
	
	public void mostrarClientes() {
		for (Cliente clienteM : this.cliente) {
			System.out.println(clienteM);
		}
	}
	
	public void buscarCliente(String dni) {
		
	}
	
	
	
}
