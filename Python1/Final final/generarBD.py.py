import sqlite3

try:
    mi_conexion=sqlite3.connect("SuperMark.db")
    cursor=mi_conexion.cursor()
    cursor.execute("CREATE TABLE Personas (id_persona INTEGER PRIMARY KEY AUTOINCREMENT, apellido VARCHAR(20) NOT NULL, nombre TEXT(30) NOT NULL, DNI INTEGER NOT NULL, domicilio TEXT(50) NOT NULL, estado INTEGER ,email TEXT(40) NOT NULL,password TEXT(12) NOT NULL, rol INTEGER )")
    cursor.execute("CREATE TABLE Productos (id_prod INTEGER PRIMARY KEY AUTOINCREMENT, nombre VARCHAR(30) not null, precio FLOAT not null, stock INTEGER not null, descripcion VARCHAR(80))")
    cursor.execute("CREATE TABLE Ventas(id_vta INTEGER PRIMARY KEY AUTOINCREMENT not null, id_persona INTEGER , fecha DATE, Fpago INTEGER not null, Entrega INTEGER not null,total FLOAT not null, FOREIGN KEY (id_persona) REFERENCES Personas(id_persona))")
#rol 0 admin ,1 cliente
#formadepago 1: efectivo 2:transferencia 3:t.debito 4: t.credito 
#entrega 0: sucursal 1:domicilio
#estado 0: inactivo 1: activo
# cuando se registra su estado= 1 , cuando se da de baja estado=0 y en validación ya no puede ingresar al sistema. 
except Exception as ex:
    print(ex)
