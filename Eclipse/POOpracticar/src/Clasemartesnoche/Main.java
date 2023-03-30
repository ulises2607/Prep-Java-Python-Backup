package Clasemartesnoche;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Profesor p= new Profesor("ramiro","medina",34,"guemes 200","CN4");
	Alumno a= new Alumno("pablo","camacho",29,"av. siempre viva 73","CN4",p);
	a.mostrar();

		}
	}