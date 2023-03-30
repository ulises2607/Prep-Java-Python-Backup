package EjercicioIntegrador;
import java.util.ArrayList;
public class Fabrica {
	
	private ArrayList<Sucursal> sucursales;
	
	public Fabrica() {
		this.sucursales = new ArrayList<>();
	}
	
	public void listarInstrumentos() {
		for (Sucursal sucursal : sucursales) {
			System.out.println(sucursal.getNombre());
			sucursal.listarInstrumentos();
		}
	}
	
	public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
		ArrayList<Instrumento> instEncontrados = new ArrayList<>();
		for (Sucursal sucursal : sucursales) {
			instEncontrados.addAll(sucursal.instrumentosPorTipo(tipo));
			
			
		}
		return instEncontrados;
	}

	
	public void agregarSucursal(Sucursal suc) {
		this.sucursales.add(suc);
	}
	
	public double [] porcInstrumentosPorTipo(String nombreSuc) {
		double [] porcentajes = null;
		
		Sucursal sucEncontrada = buscarSucursal(nombreSuc);
		
		if(sucEncontrada != null) {
			porcentajes = sucEncontrada.porcInstrumentosPorTipo();
		}
		return porcentajes;
	}
	
	public Instrumento borrarInstrumento(String ID) {
		Instrumento borrado = null;
		int i = 0;
		while (i < sucursales.size() && borrado == null) {
			borrado = sucursales.get(i).borrarInstrumento(ID);
			i++;
		}
		
		return borrado;
	}
	
	private Sucursal buscarSucursal (String nombreSuc) {
		int i = 0;
		Sucursal sucEncontrada = null;
		while (i< sucursales.size() && this.sucursales.get(i).getNombre().equals(nombreSuc)) {
			i++;
		}
		if(i < sucursales.size() ) {
			sucEncontrada = this.sucursales.get(i);
		}
		return sucEncontrada;
	}
	
}
