
public class Auto {
// atributos / caracteristicas
	public String color;
	public String marca;
	public int año;
	public Extintor matafuegos;
	
	//Constructor / metodo o funcion especial--> para asignar valores a los atrib.
	// Parametros --> Datos de entrada --> son ingredientes.
	public Auto(String colorParam,String marcaParam, int añoParam,Extintor mataParam ) {
		this.color = colorParam;
		this.marca = marcaParam;
		this.año = añoParam;
		this.matafuegos = mataParam;
	}
	
	
}
