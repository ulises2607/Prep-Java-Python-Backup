package EjercicioIntegrador;
import java.util.ArrayList;
public class Sucursal {
	private ArrayList<Instrumento> instrumentos;
	private String nombre;
	
	
	public Sucursal(String nombre) {
		this.nombre = nombre;
		this.instrumentos = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	
	public void agregarInstrumento(Instrumento ins) {
		this.instrumentos.add(ins);
	}


	public void listarInstrumentos() {
		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento);
		}
	}
	
	public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
		ArrayList<Instrumento> instEncontrados = new ArrayList<>();
		for (Instrumento instrumento : instrumentos) {
			if(instrumento.getTipo()==tipo) {
				instEncontrados.add(instrumento);
				
			}
		}
		return instEncontrados;
	}
	
	public Instrumento borrarInstrumento(String ID) {
		Instrumento insABorrar = buscarInstrumento(ID);
	
		this.instrumentos.remove(insABorrar);
		return insABorrar;
		
	}
	
	private Instrumento buscarInstrumento(String ID) {
		int i = 0;
		Instrumento insEncontrado = null;
		while (i< instrumentos.size() && this.instrumentos.get(i).getID().equals(ID)) {
			i++;
		}
		if(i < instrumentos.size()) {
			insEncontrado = this.instrumentos.get(i);
		}
		return insEncontrado;
	}
	
	public double [] porcInstrumentosPorTipo() {
		final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
		double [] porcentajes = new double[CANT_INSTRUMENTOS];
		for (Instrumento instrumento : instrumentos) {
			porcentajes[instrumento.getTipo().ordinal()]++; 
			
		}
		
		return porcentajes;
	}
		
	
	
}
