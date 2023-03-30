
public class Mascota {
	protected String nombre;
	private String color;
	
	public Mascota(String nomParam, String colorParam ) {
		this.nombre = nomParam;
		this.color = colorParam;
	}
	public String getColor() {
		return color;
	}
}
