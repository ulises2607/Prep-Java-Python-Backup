import java.util.*;
public class Administracion {
	private String nombre;
	private ArrayList <Usuarios> listauser;
	private ArrayList <Libros> librosAdm;
	
	public Administracion(String nombre) {
		this.nombre = nombre;
		
		this.librosAdm = new ArrayList<>();
		this.listauser = new ArrayList<>();
				
	}
	
	public Administracion() {
		
	}
	//-----------------------------------------------------------------//
	// METODOS PARA LIBROS
	public void agregarLibro(Libros lib) {
		this.librosAdm.add(lib);
	}
	
	public void listarLibros() {
		for(Libros libros: librosAdm) {
			System.out.println(libros);
		}
	}
	private Libros buscarLibrosporNom(String nombreL) {
		int i = 0;
		Libros libroEncontrado = null;
		while(i < librosAdm.size() && this.librosAdm.get(i).getNombreL().equals(nombreL)) {
			i++;
		}
		if(i < librosAdm.size()) {
			libroEncontrado = this.librosAdm.get(i);
		}
		return libroEncontrado;
	}
	private Libros buscarLibrosPorAutor(String autor) {
		int i = 0;
		Libros libroEncontrado = null;
		while(i < librosAdm.size() && this.librosAdm.get(i).getAutor().equals(autor)) {
			i++;
		}
		if(i < librosAdm.size()) {
			libroEncontrado = this.librosAdm.get(i);
		}
		return libroEncontrado;
	}
	
	public Libros borrarLibros(String nombreL) {
		Libros libroABorrar = buscarLibrosporNom(nombreL);
		this.librosAdm.remove(libroABorrar);
		return libroABorrar;
	}
	//---------------------------------------------------------------------------//
	
	//METODOS PARA USUARIOS
	
}	
