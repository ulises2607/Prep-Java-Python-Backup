
public class Auto {
// atributos / caracteristicas
	public String color;
	public String marca;
	public int a�o;
	public Extintor matafuegos;
	
	//Constructor / metodo o funcion especial--> para asignar valores a los atrib.
	// Parametros --> Datos de entrada --> son ingredientes.
	public Auto(String colorParam,String marcaParam, int a�oParam,Extintor mataParam ) {
		this.color = colorParam;
		this.marca = marcaParam;
		this.a�o = a�oParam;
		this.matafuegos = mataParam;
	}
	
	
}
