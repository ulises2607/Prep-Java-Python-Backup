
public class Serie {
// Agregaremos atributos
	private String titulo;
	private int numerosDeTemp;
	private String genero;
	private String creador;

//Procedemos con el Constructor
	public Serie (String p1, int p2, String p3, String p4) {
		//Asignar valor a los atributos
		this.titulo = p1;
		this.numerosDeTemp = p2;
		this.genero = p3;
		this.creador = p4;
		
	}
// QUE HACER CON LA FUNCION
	public void mostrar() {
		System.out.println("El titulo de la series es "+this.titulo);
		System.out.println("tiene "+this.numerosDeTemp+" de temporadas");
		System.out.println("Del genero "+this.genero);
		System.out.println("Y su creador es "+this.creador);
	}
	public void setTitulo(String parametro) {
		this.titulo = parametro;
	}
	public void numerosDeTemp(int parametro) {
		this.numerosDeTemp = parametro;
	}
	public void setGenero(String parametro) {
		this.genero = parametro;
	}
	public void setCreador(String parametro) {
		this.creador = parametro;
	}
}
