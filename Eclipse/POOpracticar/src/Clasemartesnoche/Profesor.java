package Clasemartesnoche;

public class Profesor extends Persona{
	private String comision;
	
	public Profesor(String nom, String ape, int edad,String domi, String comision) {
		super(nom,ape,edad,domi);
		this.comision=comision;
	}
	public Profesor() {
		
	}
	public String getNombre() {
		return getNombre();
	}
}

