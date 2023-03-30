
public class Principal {

	public static void main(String[] args) {

		Asignatura notas = new Asignatura();
		Alumno a1 = new Alumno("ulises","cappa",35261205,notas);
		
		notas.setCalificaciones(0, 0, 0);
	
		System.out.println("Notas de matematicas de ulises");
		System.out.println(a1.getNotas().getMatematicas());
		
		System.out.println("getnotas"+a1.getNotas());
		
		System.out.println("notas historia: "+a1.getNotas().getHistoria());
		
	}
	

	}


