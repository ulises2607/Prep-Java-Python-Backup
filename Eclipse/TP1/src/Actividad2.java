
public class Actividad2 {
	public static void main (String[] args) {
		String presentacion = "Comentarios en JAVA";
				System.out.println(presentacion);
				System.out.println("Introduccion");
String Introduccion = "Los comentarios son ignorados por el compilador y solo son útiles para el programador. Ayudan a explicar los aspectos relevantes de un programa y lo hacen más legibles.\n"
		+ "En un programa Java hay tres tipos de comentarios\r\n";
		System.out.println(Introduccion);
		
		String comentario1 = "Comentario de Bloque: Empieza por /* y termina con */\n";
		System.out.println(comentario1);
		String comentario2 = "Comentario de Documentacion: Empieza por /** y termina con */ \r\n"
				+ "En un comentario de documentación normalmente se indica el autor y la versión del software.\n";
		System.out.println(comentario2);
		String comentario3 = "Comentario de Linea: Empieza por // \r\n"
				+ "El comentario comienza con estos caracteres y termina al final de la línea.\r\n"
				+ "Cada línea es un comentario.\n";
		System.out.println(comentario3);
		
	}
}