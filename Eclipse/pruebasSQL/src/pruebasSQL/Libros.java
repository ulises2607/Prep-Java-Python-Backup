package pruebasSQL;

public class Libros {
	private String nombreL;
	private String autor;
	private String categoria;
	private int Codigo;
	
	private int descargas;
	
	public Libros (String nombreL, String autor) {
		this.nombreL = nombreL;
		this.autor = autor;
		this.descargas = descargas;
	}
	
	public String getNombreL() {
		return nombreL;
	}
	public String getAutor() {
		return autor;
	}
	public int getDescargas() {
		return descargas;
	}
	
	public void setNombreL(String nl) {
		this.nombreL = nl;
	}
	public void setAutor(String au) {
		this.autor = au;
	}
	public void cantDescargas(int desc) {
		
		this.descargas = desc;
	}
	public void insertar(String nombre, String autor, int tipo) {}

	@Override
	public String toString() {
		return "Libro [nombreL=" + nombreL + ", autor=" + autor + ", descargas=" + descargas + "]";
	}
}
