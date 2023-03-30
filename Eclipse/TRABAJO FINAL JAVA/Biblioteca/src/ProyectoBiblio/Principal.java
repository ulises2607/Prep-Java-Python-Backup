package ProyectoBiblio;
import java.util.*;
public class Principal {
	public static void main(String []args) {
		
		Usuario usuario = null;
		Suscripcion susc = null;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresar a Biblioteca Virtual");
	    System.out.println("(1) para ingresar con cuenta \n(2) para ingresar como invitado\n");
		int ingreso = leer.nextInt();

		if (ingreso == 1) {
			
			System.out.println("Ingrese usuario");
			String loginIngresado = leer.next();
			System.out.println("Ingrese contraseña");
			String claveIngresada = leer.next();
			
			
			// -----------------------------------HILO ADMINISTRACION-----------------------------------------------
			Administracion consultaUser = new Administracion();
			
			usuario = consultaUser.validarLogin(loginIngresado, claveIngresada);
			
				
			if (usuario != null) {
				ConsultasLibros consultaBook = new ConsultasLibros();
				System.out.println("Bienvenido " + usuario.getNombre() + " " + usuario.getApellido());

				if (usuario.getCategoria() == 1) {
					System.out.println(" \n ===============Cuenta administrador===============");
					System.out.println("¿Desea agregar o modificar datos? \n 1)Si    2)No\n");

					int respuesta = leer.nextInt();
					
					if(respuesta == 1) {
						
						int opcion;
						do {
					
									System.out.println("\n ...............MENU ADMINISTACION................");
						System.out.println("1) Agregar nuevo usuario");
						System.out.println("2) Modificar usuario");
						System.out.println("3) Dar baja usuario");
						System.out.println("4) Eliminar usuario");
						System.out.println("5) Mostrar socios dados de ALTA");
						System.out.println("6) Mostrar socios dados de BAJA");
						System.out.println("7) Agregar Libro nuevo");
						System.out.println("8) Modificar libro");
						System.out.println("9) Eliminar libro");
						System.out.println("10) Mostrar libros");
						System.out.println("0) Salir \n");

						 opcion = leer.nextInt();

						switch (opcion) {
						case 1:
							consultaUser.insertarUsuario(usuario.getCategoria());
							break;
						case 2:
							consultaUser.actualizarUsuario(usuario.getCategoria());
							break;
						case 3:
							System.out.println("No disponible aun");
							break;
						case 4:
							consultaUser.eliminarUsuario(usuario.getCategoria());
							break;
						case 5:
							consultaUser.mostrarUsuariosSocios(usuario.getCategoria());
							break;
						case 6:
							consultaUser.mostrarUsuariosBaja(usuario.getCategoria());
							break;
						case 7:
							consultaBook.insertarLibro(usuario.getCategoria());
							break;
						case 8:
							consultaBook.actualizarLibro(usuario.getCategoria());
							break;
						case 9:
							consultaBook.eliminarLibro(usuario.getCategoria());
							break;
						case 10:
							consultaBook.mostrarLibros(2);
						default:
							
							break;
						}

						}while(opcion != 0);
					
					}
					System.out.println("Gestion administrativa finalizada.");
					
				}
				
				/////////////////////CATEGORIA SOCIO////////////////////////////
				
				if (usuario.getCategoria() == 2) {
					int opcion2;
					do {
					
					System.out.println("\n =============CATALOGO DE LIBROS===============\n");
					System.out.printf("%2S,%35s,%35s,%35s,%35s%n", "ID", "TITULO", "DESCRIPCIÓN", "RUTA IMAGEN",
							"LINK DE DESCARGA");
					ConsultasLibros libros2 = new ConsultasLibros();
					libros2.mostrarLibros(usuario.getCategoria());
					
					System.out.println("---------------------------------------------");
					System.out.println("");
					System.out.println("¿Que desea realizar?");
					System.out.println("");
					System.out.println("1) Descargar libro");
					System.out.println("2) Pagar suscripcion");
					System.out.println("3) Mostrar suscripcion");
					System.out.println("4) ");
					System.out.println("5)Salir");
					
					
					opcion2 = leer.nextInt();
					switch(opcion2) {
					case 1:
						//ConsultasSuscripcion suscUser = new ConsultasSuscripcion();
						//susc =suscUser.estaPagada(usuario.getIdUsuario(), susc.getIdPago() );
						
						//if(susc != null) {
						
						Scanner leer2 = new Scanner(System.in);
						System.out.print("Ingrese titulo del libro: \n");
						String libroDescarga = leer2.nextLine();
						
						ConsultasHistorial historial = new ConsultasHistorial();
						historial.descargarLibro(libroDescarga, usuario.getIdUsuario());
						
						//System.out.println("La cantidad de descargas que lleva en el dia son: "+historial.obtenerDescargasDia(usuario.getIdUsuario()));
						//}else {
						//System.out.println("Regularice su situacion para poder descargar.");
						//}
						break;
					case 2:
						ConsultasHistorial historial1 = new ConsultasHistorial();
						
						int hist =historial1.obtenerDescargasMes(usuario.getIdUsuario());
						
						System.out.println("La cantidad de descargas realizadas por el usuario "
								 +usuario.getNombre() +" "+ usuario.getApellido()
								+ " son: "+hist);
						
					case 3:
						ConsultasSuscripcion consusc = new ConsultasSuscripcion();
						
						
						consusc.mostrarSuscripcion(usuario.getIdUsuario());
						
						
					case 7:
						System.out.println("Gracias por visitarnos");
						break;
						default:
							break;
					}
				}while(opcion2 != 4);
					
				}
			}
			
		}
				

		

		if (ingreso == 2) {
			System.out.println("Bienvenido usuario invitado");
			System.out.println("\n--------------CATALOGO DE LIBROS---------------\n");
			
			System.out.printf("%2S,%35s,%35s,%35s%n", "ID", "TITULO", "DESCRIPCIÓN", "RUTA IMAGEN");
			//EXTRAYENDO LOS LIBROS DE LA BASE DE DATOS
			ConsultasLibros libros = new ConsultasLibros();
			libros.mostrarLibros(3);
			
		}
		
	}
	

}