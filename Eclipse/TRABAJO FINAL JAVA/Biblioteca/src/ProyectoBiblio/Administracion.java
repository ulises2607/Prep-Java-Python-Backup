package ProyectoBiblio;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.Scanner;

	public class Administracion {
		Conexion conn = new Conexion();
		Connection usarConexion = null;
		Statement stm = null;
		ResultSet rs = null;
		PreparedStatement ps;

		public void mostrarUsuarios(int grado) {

			if (grado == 1) {

				try {
					usarConexion = conn.getConexion(); 
					String consulta = "SELECT * FROM usuario";
					stm = usarConexion.createStatement();
					rs = stm.executeQuery(consulta);
					while (rs.next()) {

						Usuario usuario = new Usuario();
						

						usuario.setIdUsuario(rs.getInt(1));
						usuario.setLogin(rs.getString(2));
						usuario.setClave(rs.getString(3));
						usuario.setNombre(rs.getString(4));
						usuario.setApellido(rs.getString(5));
						usuario.setCategoria(rs.getInt(6));

						System.out.printf("%2d,%10s,%10s,%16s,%16s,$2d%n", usuario.getIdUsuario(), usuario.getLogin(),
								usuario.getClave(), usuario.getNombre(), usuario.getApellido(), usuario.getCategoria());

					}
				} catch (Exception e) {
					System.out.println("Error: " + e);
				}

			} else {
				System.out.println("Usuario no autorizado");
			}

		}

		public void mostrarUsuariosBaja(int categoria) {

			if (categoria == 1) {

				try {
					usarConexion = conn.getConexion(); 
					String consulta = "SELECT * FROM usuario where jerarquia = 4";
					stm = usarConexion.createStatement();
					rs = stm.executeQuery(consulta);
					while (rs.next()) { 

						Usuario usuario = new Usuario();
				

						usuario.setIdUsuario(rs.getInt(1));
						usuario.setLogin(rs.getString(2));
						usuario.setClave(rs.getString(3));
						usuario.setNombre(rs.getString(4));
						usuario.setApellido(rs.getString(5));
						usuario.setCategoria(rs.getInt(6));

						System.out.printf("%2d,%10s,%10s,%16s,%16s,$2d%n", usuario.getIdUsuario(), usuario.getLogin(),
								usuario.getClave(), usuario.getNombre(), usuario.getApellido(), usuario.getCategoria());

					}
					if(!rs.next()) {
						System.out.println("No hay usuarios dados de baja aun");
					}
				} catch (Exception e) {
					System.out.println("Error: " + e);
				}

			} else {
				System.out.println("Usuario no autorizado");
			}

		}

		public void mostrarUsuariosSocios(int categoria) {

			if (categoria == 1) {

				try {
					usarConexion = conn.getConexion(); 
					String consulta = "SELECT * FROM usuario where categoria = 2";
					stm = usarConexion.createStatement();
					rs = stm.executeQuery(consulta); 
					while (rs.next()) { 

						Usuario usuario = new Usuario();
						

						usuario.setIdUsuario(rs.getInt(1));
						usuario.setLogin(rs.getString(2));
						usuario.setClave(rs.getString(3));
						usuario.setNombre(rs.getString(4));
						usuario.setApellido(rs.getString(5));
						usuario.setCategoria(rs.getInt(6));

						System.out.printf("%2d,%10s,%10s,%16s,%16s,%2d%n", usuario.getIdUsuario(), usuario.getLogin(),
								usuario.getClave(), usuario.getNombre(), usuario.getApellido(), usuario.getCategoria());

					}
					if(!rs.next()) {
						System.out.println("Socios activos");
					}
				} catch (Exception e) {
					System.out.println("Error en mostrarsocios: " + e);
				}

			} else {
				System.out.println("Usuario no autorizado");
			}

		}

		public void insertarUsuario(int categoria) {
			if (categoria == 1) {
				Scanner leer = new Scanner(System.in);
				
				System.out.println("Ingrese nuevo Login");
				String login = leer.next();
				System.out.println("Ingrese nueva Clave");
				String clave = leer.next();
				System.out.println("Ingrese nombre del nuevo usuario");
				String nombre = leer.next();
				System.out.println("Ingrese apellido del nuevo usuario");
				String apellido = leer.next();
				System.out.println("Ingrese grado del nuevo usuario \n(1:admin \n 2:socio)");
				int grad = leer.nextInt();

				Usuario user = new Usuario(login, clave, nombre, apellido, grad);
				try {
					String consulta = "insert into usuario (login, clave, nombre, apellido, categoria)values(?,?,?,?,?)";
					usarConexion = conn.getConexion();
					ps = usarConexion.prepareStatement(consulta);
					
					ps.setObject(1, user.getLogin());
					ps.setObject(2, user.getClave());
					ps.setObject(3, user.getNombre());
					ps.setObject(4, user.getApellido());
					ps.setObject(5, user.getCategoria());
					ps.executeUpdate();
					System.out.println("Usuario agregado exitosamente");
				} catch (Exception e) {
					System.out.println("No se puede agregar el usuario)");
				}
			} else {
				System.out.println("Usuario no autorizado");
			}

		}

		public Usuario buscarUsuario(int idUsuario, int categoria) {
			Usuario usuario = new Usuario();
			if (categoria == 1) {
				try {
					usarConexion = conn.getConexion(); 
					String consulta = "SELECT * FROM usuario where idUsuario=" + idUsuario + "";
					stm = usarConexion.createStatement();
					rs = stm.executeQuery(consulta); //
					if (rs.next()) {
						Usuario user = new Usuario();
						System.out.println("paso por aqui" + rs.getString(2));
						
						user.setIdUsuario(rs.getInt(1));
						user.setLogin(rs.getString(2));
						user.setClave(rs.getString(3));
						user.setNombre(rs.getString(4));
						user.setApellido(rs.getString(5));
						user.setCategoria(rs.getInt(6));
						usuario = user;
					}

				} catch (Exception e) {
					System.out.println("No se encontro usuario: " + e);
				}
			}
			return usuario;
		}

	//SELECT DATEDIFF(NOW(),'2002-11-02'); #cuantos días han pasado
		// SELECT DATEDIFF(NOW(),'2010-03-20'); #Cuantos días faltan
		// date_add(now(), interval 3 day)
		public void actualizarUsuario(int categoria) {

			if (categoria == 1) {
				Scanner leer = new Scanner(System.in);
				System.out.print("Ingrese id del usuario que quiere actualizar");
				int idUsuario = leer.nextInt();
				Usuario userOldData = buscarUsuario(idUsuario, categoria);

				System.out.print("Cambiar login " + userOldData.getLogin() + ": ");
				String loginNuevo = leer.next();
				System.out.print("Nueva clave: ");
				String claveNueva = leer.next();
				System.out.print("Cambiar nombre " + userOldData.getNombre() + ": ");
				String nombreNuevo = leer.next();
				System.out.print("Cambiar apellido " + userOldData.getApellido() + ": ");
				String apellidoNuevo = leer.next();
				System.out.print("Cambiar jerarquia " + userOldData.getCategoria() + " (1:admin, 2:socio, 4:baja): ");
				int gradoNuevo = leer.nextInt();
				String consulta = "update usuarios set login=?, clave=?, nombre=?, apellido=?, jerarquia=? where idUsuario=?";
				try {
					usarConexion = conn.getConexion();
					ps = usarConexion.prepareStatement(consulta);
					// idUsuario, login, clave, nombre, apellido, jerarquia

					ps.setObject(1, loginNuevo);
					ps.setObject(2, claveNueva);
					ps.setObject(3, nombreNuevo);
					ps.setObject(4, apellidoNuevo);
					ps.setObject(5, gradoNuevo);
					ps.setObject(6, idUsuario);

					ps.executeUpdate();
					System.out.println("Datos actualizados correctamente!");
				} catch (Exception e) {
					System.out.println("Error: " + e);
				}
			} else {
				System.out.println("Usuario no autorizado");
			}

		}

		public void eliminarUsuario(int categoria) {
			if (categoria == 1) {
				try {

					Scanner leer = new Scanner(System.in);
					System.out.print("Ingrese id del usuario que desea eliminar");
					int idUsuario = leer.nextInt();

					String consulta = "delete from usuario where idUsuario=?";
					usarConexion = conn.getConexion();
					ps = usarConexion.prepareStatement(consulta);
					ps.setInt(1, idUsuario);
					ps.executeUpdate();
					System.out.println("Usuario eliminado correctamente!");
				} catch (Exception e) {
					System.out.println("Error: " + e);
				}
			} else {
				System.out.println("Usuario no autorizado");
			}

		}

		public Usuario validarLogin(String login, String clave) {

			Usuario userValidado = null;

			String consulta = "SELECT * FROM usuario where login='" + login + "' and clave='" + clave + "'";
			// usamos esta consulta...
			try {
				usarConexion = conn.getConexion();
				stm = usarConexion.createStatement();
				rs = stm.executeQuery(consulta); // tenemos toda la inf de usuarios

				if (rs.next()) { //pregunta si existe el registro
					Usuario usuario1 = new Usuario();
					// idUsuario, login, clave, nombre, apellido, jerarquia
					usuario1.setIdUsuario(rs.getInt(1));
					usuario1.setLogin(rs.getString(2));
					usuario1.setClave(rs.getString(3));
					usuario1.setNombre(rs.getString(4));
					usuario1.setApellido(rs.getString(5));
					usuario1.setCategoria(rs.getInt(6));

					userValidado = usuario1;
				} else {
					System.out.println("Login o clave incorrecta");
				}

			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
			return userValidado;
		}

	}

