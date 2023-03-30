package EjercicioIntegrador;
import java.util.*;
public class Principal {

	public static void main(String[] args) {

		Fabrica f = new Fabrica();
		cargarFabrica(f);
		
		
		
		//ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.PERCUSION);
		//for (Instrumento instrumento : lista) {
		//	System.out.println(instrumento);
		//}
	
		
		Instrumento borrado = f.borrarInstrumento("HGF678");
		System.out.println("Se borro: "+ borrado);
		
		f.listarInstrumentos();
		
		double [] porcs = f.porcInstrumentosPorTipo("Sucursal B");
		for(int i = 0; i < porcs.length ; i++) {
			System.out.println(porcs[i]);
		}
	}
	
	private static void cargarFabrica(Fabrica f) {
		Sucursal s1 = new Sucursal("Sucursal A");
		Sucursal s2 = new Sucursal("Sucursal B");
		
		s1.agregarInstrumento(new Instrumento("ABC123",13214,TipoInstrumento.CUERDA));
		s1.agregarInstrumento(new Instrumento("CBD456",12245,TipoInstrumento.VIENTO));
		s1.agregarInstrumento(new Instrumento("HGF678", 546512, TipoInstrumento.PERCUSION));
		
		s2.agregarInstrumento(new Instrumento("UIO567", 678987, TipoInstrumento.CUERDA));
		s2.agregarInstrumento(new Instrumento("AGJ924", 475687, TipoInstrumento.VIENTO));
		
		
		
		f.agregarSucursal(s1);
		f.agregarSucursal(s2);
	}

}
