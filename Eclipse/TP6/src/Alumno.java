
public class Alumno extends Persona{
	private Asignatura notas;
	
	public Alumno(String nombre, String apellido, long dni ,Asignatura notas) {
		super(nombre,apellido,dni);
		this.notas= notas;
	}

	public Asignatura getNotas() {
		 notas.getMatematicas();
		 notas.getHistoria();
		 notas.getLengua();
		 return notas;
	}
	

	
}
	
		
	
	
	
	

