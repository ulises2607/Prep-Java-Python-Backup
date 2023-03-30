
public class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	
	public Persona(String nombre, String apellido, long dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	
}
