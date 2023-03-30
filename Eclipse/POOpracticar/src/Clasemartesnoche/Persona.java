package Clasemartesnoche;

public class Persona {
	//Atributos
		protected String nombre;
		private String apellido;
		private int edad;
		private String domicilio;
		//constructor por defecto
		public Persona() {
			
		}
		//Constructor comun
		public Persona(String nombre, String apellido, int edad,String domicilio) {
			this.nombre=nombre;
			this.apellido=apellido;
			this.edad=edad;
			this.domicilio=domicilio;
		}
		//Constructor copia
		public Persona(Persona pers) {
			this.nombre=pers.nombre;
			this.apellido=pers.apellido;
			this.edad=pers.edad;
			this.domicilio=pers.domicilio;
		}
		public String mostrar(Persona pers) {
			String datos="los datos son: \n";
			datos+=pers.nombre+"\n";
			datos+=pers.apellido+"\n";
			datos+=pers.edad+"\n";
			datos+=pers.domicilio+"\n";
			return datos;
		}
		public void mostrar() {
			System.out.println("los datos son: \n"+"nombre: "+this.nombre+"\n"+ "el apellido es: "+this.apellido);
		}
		
		public void saludar() {
			System.out.println("holas");
		}
}
