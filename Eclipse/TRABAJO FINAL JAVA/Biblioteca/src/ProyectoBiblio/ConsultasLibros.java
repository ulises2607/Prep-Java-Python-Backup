package ProyectoBiblio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConsultasLibros {
	Conexion conn = new Conexion();
	Connection usarConexion = null;
	Statement stm = null;
	ResultSet rs = null;
	PreparedStatement ps;

	
	public void mostrarLibros(int grado) {

		if (grado > 0 && grado < 5) {

			try {
				usarConexion = conn.getConexion(); // estamos usando la llave
				String consulta = "SELECT * FROM libros";// usamos esta consulta...
				stm = usarConexion.createStatement();
				rs = stm.executeQuery(consulta); // tenemos toda la inf de libros
				while (rs.next()) { // leemos linea por linea

					Libro libro = new Libro();

					libro.setIdLibro(rs.getInt(1));
					libro.setTitulo(rs.getString(2));
					libro.setDescripcion(rs.getString(3));
					libro.setRutaImagen(rs.getString(4));
					libro.setLinkDescarga(rs.getString(5));

					switch (grado) {
					case 1:
						System.out.printf("%2d,%35s,%35s,%35s,%35s%n", libro.getIdLibro(), libro.getTitulo(),
								libro.getDescripcion(), libro.getRutaImagen(), libro.getLinkDescarga());
						break;
					case 2:
						System.out.printf("%2d,%35s,%35s,%35s,%35s%n", libro.getIdLibro(), libro.getTitulo(),
								libro.getDescripcion(), libro.getRutaImagen(), libro.getLinkDescarga());
						break;
					case 3:
						System.out.printf("%2d,%35s,%35s,%35s%n", libro.getIdLibro(), libro.getTitulo(),
								libro.getDescripcion(), libro.getRutaImagen());
						break;
					case 4:
						System.out.printf("%2d,%35s,%35s,%35s,%35s%n", libro.getIdLibro(), libro.getTitulo(),
								libro.getDescripcion(), libro.getRutaImagen(),
								"Verificar su situacion (cuotas/limite de descargas)");
						break;
					default:
						System.out.println("Grado no valido");
						break;
					}

				}
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}

		} else {
			System.out.println("Usuario desconocido");
		}

	}

	public int buscarLibro(String tituloLibro) {
		int idLibro = 0;
		try {
			String consulta = "SELECT idLibro from libros where titulo='" + tituloLibro + "'";
			usarConexion = conn.getConexion();
			stm = usarConexion.createStatement();
			rs = stm.executeQuery(consulta);
			if (rs.next()) {
				idLibro = rs.getInt(1);
			
			} else {
				System.out.println("No se encontro el libro");
			}

		} catch (Exception e) {
			System.out.println("Error de metodo Busqueda" + e);
		}
		return idLibro;
	}

	public void insertarLibro(int grado) {
		if (grado == 1) {
			
			try {
				Scanner leer = new Scanner(System.in);

				System.out.println("Ingrese titulo del libro: ");
				String titulo = leer.nextLine();
				System.out.println("Ingrese descripcion del libro: ");
				String descripcion = leer.nextLine();
				System.out.println("Ingrese ruta de la imagen de portada: ");
				String imagen = leer.nextLine();
				System.out.println("Ingrese link de descarga: ");
				String linkDescarga = leer.nextLine();

				String consulta = "insert into libros (titulo,descripcion,rutaImagen,linkDescarga)values(?,?,?,?)";
				usarConexion = conn.getConexion();
				ps = usarConexion.prepareStatement(consulta);
				// idLibro, titulo, descripcion, rutaImagen, linkDescarga
				ps.setObject(1, titulo);
				ps.setObject(2, descripcion);
				ps.setObject(3, imagen);
				ps.setObject(4, linkDescarga);
				ps.executeUpdate();
				System.out.println("Libro agregado exitosamente!");
			} catch (Exception e) {
				System.out.println("No se puedo agregar el libro");
			}
		} else {
			System.out.println("Usuario no autorizado");
		}

	}

	public Libro buscarLibro(int grado, String titulo) {
		Libro book = new Libro();
		if (grado == 1) {
			try {
				usarConexion = conn.getConexion(); // estamos usando la llave
				String consulta = "SELECT * FROM libros where titulo='" + titulo + "'";// usamos esta
				stm = usarConexion.createStatement();
				rs = stm.executeQuery(consulta); // tenemos toda la inf de usuarios
				if (rs.next()) {
					Libro libro = new Libro();
					// idLibro, titulo, descripcion, rutaImagen, linkDescarga

					libro.setTitulo(rs.getString(1));
					libro.setDescripcion(rs.getString(2));
					libro.setRutaImagen(rs.getString(3));
					libro.setLinkDescarga(rs.getString(4));
					book = libro;
				}

			} catch (Exception e) {
				System.out.println("Libro no encontrado: " + e);
			}
		}
		return book;
	}

	public void actualizarLibro(int grado) {

		// idLibro, titulo, descripcion, rutaImagen, linkDescarga
		if (grado == 1) {

			Scanner leer = new Scanner(System.in);
			System.out.print("Ingrese titulo del libro que quiere actualizar");
			String titulo = leer.next();
			Libro bookOldData = buscarLibro(grado, titulo);

			System.out.print("Cambiar titulo " + bookOldData.getTitulo() + ": ");
			String tituloNew = leer.next();
			System.out.print("Nueva descripcion: ");
			String descripcionNew = leer.next();
			System.out.print("Cambiar ruta imagen (ruta anterior: " + bookOldData.getRutaImagen() + "):  ");
			String imagenNew = leer.next();
			System.out.print("Cambiar link de descarga: ");
			String descargaNew = leer.next();

			String consulta = "update libros set  titulo=?, descripcion=?, rutaImagen=?, linkDescarga=? where titulo=?";
			try {
				usarConexion = conn.getConexion();
				ps = usarConexion.prepareStatement(consulta);

				ps.setObject(1, tituloNew);
				ps.setObject(2, descripcionNew);
				ps.setObject(3, imagenNew);
				ps.setObject(4, descargaNew);
				ps.setObject(5, titulo);

				ps.executeUpdate();
				System.out.println("‥ibro actualizado correctamente!");
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		} else {
			System.out.println("Usuario no autorizado");
		}

	}

	public void eliminarLibro(int grado)
	
	{
		if (grado ==1) {
			Scanner leer = new Scanner(System.in);
			System.out.print("Ingrese id del libro que quiere eliminar");
			int idLibro = leer.nextInt();
			String consulta = "delete from libros where idLibro=?";
		try {
			usarConexion = conn.getConexion();
			ps = usarConexion.prepareStatement(consulta);
			ps.setInt(1, idLibro);
			ps.executeUpdate();
			System.out.println("Libro eliminado correctamente!");
		} catch (Exception e) {

		}
		}else {
			System.out.println("Usuario no autorizado");
		}
		
	}

}