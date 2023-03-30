import tkinter
from tkinter import *
from tkinter import messagebox,ttk
from tkinter import Tk 
import sqlite3 as sql
from tkinter import Scrollbar

#NOMBRE DE MI BASE DE DATOS
db_name= 'Supermark.db'
class Home():
    
    def __init__(self,ventana):
        #DEFINO EL CONSTRUCTOR Y EL PARÁMETRO PARA INICIAR LA VENTANA
        self.wind= ventana
        self.wind.title('Super Market')
        #DECIDO EL TAMAÑO DE MI VENTANA
        self.wind.geometry('300x500')
        #MODIFICO EL ICONO POR DEFECTO
        self.wind.iconbitmap('icono.ico')
        #INSERTO UNA IMAGEN (EN ESTE CASO, EL LOGO DE SUPER MARKET)
        img=PhotoImage(file='super.png')
        #MODIFICO EL TAMAÑO DEL ARCHIVO PNG, MIENTRAS MAYOR SEA EL NÚMERO, MÁS SE ACHICA
        img= img.subsample(2,2)
        #COLOCO LA IMAGEN DENTRO DE UNA ETIQUETA LABEL PARA QUE SE MUESTRE EN NUESTRA APP
        logo=Label(self.wind,image=img)
        logo.pack()
        #LOGIN DE USUARIO
        frame= LabelFrame(self.wind,text="Usuario")
        frame.pack()
        Label(frame,text="Ingrese email:").pack()
        self.email2=Entry(frame)
        self.email2.pack()
        Label(frame,text="Ingrese su contraseña:").pack()
        self.contrasenia= Entry(frame,show="*")
        self.contrasenia.pack()
        ttk.Button(frame,text="Iniciar Sesión",command=self.login).pack()
        #MUESTRO OPCIONES PARA NUEVOS USUARIOS Y EL CASO DE SER ADMINISTRADOR
        frame2= LabelFrame(self.wind,text="Opciones")
        frame2.pack()
        ttk.Button(frame2,text="Registrarse",command=self.Registrarse).pack(side=LEFT)
        ttk.Button(frame2,text="Soy Administrador",command=self.admin).pack(side=LEFT)
        ttk.Button(frame2,text="Salir",command=quit).pack(side=LEFT)
        self.wind.mainloop()

    def login(self):
        #CONEXIÓN A BASE DE DATOS
        db= sql.connect('Supermark.db')
        c=db.cursor()
        #CONDICION PARA INICIAR SESION QUE LOS DATOS DE MI DB COINCIDAN CON EL EMAIL Y CONTRASEÑA QUE ESTOY INGRESANDO
        c.execute("SELECT * FROM Personas WHERE email=? AND password=? ",(self.email2.get(),self.contrasenia.get()))
        
        if c.fetchall():
            messagebox.showinfo(title="Login exitoso", message="Sesión iniciada correctamente")
            vent3 = Tk()
            self.ventana3 = vent3
            self.ventana3.title('Cliente Bienvenido a Super Market')
            self.ventana3.geometry('1200x700')
            #VENTANA DE INGRESO COMO CLIENTE
            self.ventana3.iconbitmap('icono.ico')
            #DEFINO LOS CONTENEDORES FRAME
            frame1 = LabelFrame(self.ventana3,text="Productos disponibles")
            frame2 = LabelFrame(self.ventana3,text="Carrito")

            frame1.pack(fill="both", expand="yes", padx=10, pady=10)
            frame2.pack(fill="both", expand="yes", padx=10, pady=10)
            #DEFINO MI TABLA DE PRODUCTOS 
            self.tabla = ttk.Treeview(frame1, height=10, columns=(f"#{n}" for n in range(0, 5)))
            self.tabla.pack()
            self.tabla.bind("<Double-Button-1>",lambda event: self.doubleClickTabla_carrito(event))
            self.tabla['show'] = 'headings'
            self.tabla.heading("#1", text="Id ", anchor=CENTER)
            self.tabla.heading("#2", text="Nombre", anchor=CENTER)
            self.tabla.heading("#3", text="Precio", anchor=CENTER)
            self.tabla.heading("#4", text="Stock", anchor=CENTER)
            self.tabla.heading("#5", text="Descripción", anchor=CENTER)
            self.mostrar_prod()
            #Botones

            self.buscar_nombre = ttk.Button(frame1,text="BUSCAR NOMBRE", command=self.buscarNombre)
            self.buscar_nombre.pack(side=tkinter.LEFT,pady=10)
            self.buscar_categoria = ttk.Button(frame1, text="BUSCAR CATEGORIA", command=self.buscarCategoria)
            self.buscar_categoria.pack(side=tkinter.RIGHT)
            ### INPUTS
            # INPUT BUSCAR NOMBRE
            self.buscar_nombre = Entry(frame1, width=60)
            self.buscar_nombre.pack(side=tkinter.LEFT,pady=10,padx=10)

            # INPUT BUSCAR CATEGORIA
            self.buscar_categoria = Entry(frame1, width=60)
            self.buscar_categoria.pack(side=tkinter.RIGHT)



            ## Tabla de carrito
            self.tabla_carrito = ttk.Treeview(frame2, height=10, columns=(f"#{n}" for n in range(0, 5)))
            self.tabla_carrito.pack()
            self.tabla_carrito.bind("<Double-Button-1>",lambda event2 : self.doubleClick_modificar_cantidad((event2)))
            self.tabla_carrito['show'] = 'headings'
            self.tabla_carrito.heading("#1", text="Id ", anchor=CENTER)
            self.tabla_carrito.heading("#2", text="Nombre", anchor=CENTER)
            self.tabla_carrito.heading("#3", text="Precio", anchor=CENTER)
            self.tabla_carrito.heading("#4", text="Cantidad", anchor=CENTER)
            ##self.tabla.heading('#5', text="Descuento", anchor=CENTER)
            self.tabla_carrito.heading("#5", text="Subtotal", anchor=CENTER)


            # BOTONES
            self.agregar_carrito = ttk.Button(frame2, text='A PAGAR',command=self.pagar)
            self.agregar_carrito.pack()

            self.eliminar_deCarrito = ttk.Button(frame2, text='ELIMINAR DEL CARRITO', command=self.eliminar_prodcarro)
            self.eliminar_deCarrito.pack()

            self.editar_deCarrito= ttk.Button(frame2,text="Editar carrito",command=self.editar_carrito)
            self.editar_deCarrito.pack()

       #MENSAJE VENTANA ERROR
        else:
            messagebox.showerror(title="Ups,algo ha salido mal",message="Usuario o contraseña incorrectos")

    def pagar(self):
        total=0
        for item in self.tabla_carrito.get_children():
            celda= float(self.tabla_carrito.set(item,"#5"))
            total+= celda
        #TOTAL COMPRA
        self.total=total
        self.vent9= Tk()
        self.vent9.iconbitmap('icono.ico')
        self.vent9.title("Ticket Super Market")
        self.vent9.geometry("500x500")
        Label(self.vent9,text="Forma de pago",font="Ubuntu 12").pack()
        self.seleccion=IntVar()
        self.seleccion.set(1)
        #RADIO BUTTON OPCIONES DE PAGO
        Label(self.vent9,text="Con transferencia tiene un 15% de descuento",font="Ubuntu 12").pack()
        Radiobutton(self.vent9,text="Transferencia",value=1,variable=self.seleccion).pack()
        Label(self.vent9,text="Con tarjeta de crédito tiene un 15% adicional",font="Ubuntu 12").pack()
        Radiobutton(self.vent9,text="Tarjeta crédito",value=2,variable=self.seleccion).pack()
        Label(self.vent9,text="Con Tarjeta de débito tiene un 10% adicional",font="Ubuntu 12").pack()
        Radiobutton(self.vent9,text="Tarjeta débito",value=3,variable=self.seleccion).pack()
        Label(self.vent9,text="Abonando en efectivo tiene un 15% de descuento",font="Ubuntu 12").pack()
        Radiobutton(self.vent9,text="Efectivo",value=4,variable=self.seleccion).pack()
        Label(self.vent9,text="Opción",font="Ubuntu 12").pack()
        self.labelValue= Entry(self.vent9,textvariable=self.seleccion)
        self.labelValue.pack()
        Label(self.vent9,text="Forma de entrega(0= sucursal, 1=domicilio): ").pack()
        
        self.entrega= Entry(self.vent9)
        self.entrega.pack()

        Label(self.vent9,text=(f"A pagar:{self.total}"),font="Ubuntu 12").pack()
        ttk.Button(self.vent9,text="Confirmar compra",command=self.descuento).pack()
        
        
    #Comando radiobutton transferencia 15% descuento
    def descuento(self):
        self.labelValue= self.labelValue.get()
        self.labelValue=int(self.labelValue)
        if self.labelValue==1:
            self.total2= self.total* (0.15)
            self.total2= self.total -self.total2
            #PAGO FINAL
            Label(self.vent9,text=f"Total a pagar {self.total2}").pack()
            messagebox.showinfo(title="Compra exitosa",message="Compra realizada con éxito")
        if self.labelValue==2:
            self.total2=self.total* (0.15)
            self.total2=self.total+self.total2
            Label(self.vent9,text=f"Total a pagar {self.total2}").pack()
            messagebox.showinfo(title="Compra exitosa",message="Compra realizada con éxito")
        if self.labelValue==3: 
            self.total2=self.total* (0.1)
            self.total2=self.total+self.total2
            Label(self.vent9,text=f"Total a pagar {self.total2}").pack()
            messagebox.showinfo(title="Compra exitosa",message="Compra realizada con éxito")
        if self.labelValue==4:  
            self.total2=self.total*(0.15)
            self.total2=self.total- self.total2
            Label(self.vent9,text=f"Total a pagar {self.total2}").pack()
            messagebox.showinfo(title="Compra exitosa",message="Compra realizada con éxito")

            Label(self.vent9,text="Fecha retiro: ").pack()
    #CARGAR TABLA DE VENTA EN BASE DE DATOS
        query= "INSERT INTO Ventas VALUES (NULL,NULL,NULL,?,?,?)"
        parametros= (self.labelValue,self.entrega.get(),self.total2)
        self.run_query(query,parametros)

    #doble click para seleccionar producto tabla_carrito
    def doubleClick_modificar_cantidad(self,event2):
        self.id= (self.tabla_carrito.item(self.tabla_carrito.selection())["values"][0])
        self.nombre = self.tabla_carrito.item(self.tabla_carrito.selection())["values"][1]
        self.precio = (self.tabla_carrito.item(self.tabla_carrito.selection())["values"][2])
        self.cantidad = (self.tabla_carrito.item(self.tabla_carrito.selection())["values"][3])
        self.subtotal = (self.tabla_carrito.item(self.tabla_carrito.selection())["values"][4])
        
    #FUNCION PARA ELIMINAR PRODUCTOS DE TABLA_CARRITO 
    def eliminar_prodcarro(self):
        pass
    def editar_carrito(self):
        pass

    def doubleClickTabla_carrito(self,event):
        self.id_prod= str(self.tabla.item(self.tabla.selection())["values"][0])
        self.nombre= str(self.tabla.item(self.tabla.selection())["values"][1])
        self.precio= (self.tabla.item(self.tabla.selection())["values"][2])
        self.stock= (self.tabla.item(self.tabla.selection())["values"][3])
        self.descripcion= str(self.tabla.item(self.tabla.selection())["values"][4])
        self.carga_cantidad()


    # FUNCIÓN PARA cargar cantidad de productos
    def carga_cantidad(self):
        # self.wind.withdraw()
        vent20 = Tk()
        self.vent20 = vent20
        self.vent20.title('Cantidad')
        # self.vent4.iconbitmap('icono.ico')
        Label(self.vent20, text="INGRESE Cantidad: ").pack()
        self.cantidad = Entry(self.vent20)
        self.cantidad.pack()
        ttk.Button(self.vent20, text="Aceptar",command=self.ingresar).pack(side=LEFT)
        self.vent20.mainloop()
    def ingresar (self):
          self.cant= int(self.cantidad.get())   
          self.precio=float(self.precio)
          self.sTotal= self.precio * self.cant
          self.vent20.withdraw()
          self.tabla_carrito.insert("",tkinter.END,values=(self.id_prod, self.nombre, self.precio,self.cantidad.get(),self.sTotal))
    
    #FUNCION PARA SELECCIONAR TABLA PRODUCTOS get_product
    def mostrar_prod(self):
        #Limpio mi tabla
        records = self.tabla.get_children()
        for element in records:
            self.tabla.delete(element)

        #Tomo todos los registros existentes
        query= "SELECT * FROM Productos"
        db_rows=self.run_query(query)

        #for row in db_rows:
            #self.tabla.insert('',0,text = row[0], values=(row[0],row[1],row[2],row[3],row[4]))
        for i in db_rows:
            self.tabla.insert('','end',values=i)
           
    def admin(self):
        self.wind.withdraw()
        vent4= Tk()
        self.vent4= vent4
        self.vent4.title('Login Administrador')
        self.vent4.iconbitmap('icono.ico')
        Label(self.vent4,text="PARA INGRESAR COMO ADMINISTRADOR, INGRESE CLAVE:").pack()
        self.clave_entrada= Entry(self.vent4,show="*")
        self.clave_entrada.pack()
        Label(self.vent4,text="(La clave es brindada por la empresa únicamente.)").pack()
        ttk.Button(self.vent4,text="Ingresar",command=self.verificar_admin).pack(side=LEFT)
        ttk.Button(self.vent4,text="Atrás",command=self.regreso_vent3).pack(side=LEFT)
        self.vent4.mainloop()

    def regreso_vent3(self):
        self.vent4.withdraw()
        self.wind.deiconify()
    def verificar_admin(self):
        self.clave_entrada.focus()
        if (self.clave_entrada.get()) == 'admin':
            messagebox.showinfo(title="Inicio de sesión correcto",message="Usted inició como administrador")
            self.vent4.withdraw()
            vent5= Tk()
            #VENTANA PRINCIPAL DE ADMINISTRADOR
            self.vent5= vent5
            self.vent5.title('Bienvenido administrador a Super Market')
            self.vent5.iconbitmap('icono.ico')
            self.vent5.geometry('200x200')
            #OPCIONES ADMINISTRACION /BOTONES
            ttk.Button(self.vent5,text="INVENTARIO",command=self.inventario).pack()
            ttk.Button(self.vent5,text="Administrar Usuarios",command=self.admin_user).pack()
            ttk.Button(self.vent5,text="Atrás",command=self.regreso_ppal).pack()
            ttk.Button(self.vent5,text="Salir",command=quit).pack()
            self.vent5.mainloop()
        else:
            messagebox.showerror(title="Error en inicio de sesión",message="La contraseña no es correcta")

    def regreso_ppal(self):
        self.vent5.withdraw()
        self.wind.deiconify()
    def admin_user(self):
        #NUEVA VENTANA DE ADMIN/ADMINISTRACIÓN DE USUARIOS
        self.vent7= Tk()
        self.vent7.title("Administrar Usuarios")
        self.vent7.geometry("1200x1200")
        self.vent7.iconbitmap('icono.ico')
            
        #GENERO CONTENEDOR
        contenedor= LabelFrame(self.vent7,text="Agregar un USUARIO")
        contenedor.grid(row = 10, column = 0, columnspan = 3, pady = 15, ipadx = 5, ipady = 5)

        #INPUT APELLIDO
        Label(contenedor,text="Apellido: ").grid(row = 1, column = 0, padx = 20, pady = 5, sticky = W)
        self.apellido_user = Entry(contenedor, width=25)
        self.apellido_user.grid(row = 1, column = 1, sticky = W)
        self.apellido_user.focus()
        #INPUT NOMBRE
        Label(contenedor,text="Nombre: ").grid(row=2,column=0,padx=20,pady=5,sticky=W)
        self.nombre_user = Entry(contenedor, width=25)
        self.nombre_user.grid(row = 2, column = 1, sticky = W)
        #INPUT DNI
        Label(contenedor, text='DNI: ').grid(row = 3, column = 0, padx = 20, pady = 5, sticky = W)
        self.dni_user = Entry(contenedor, width=25)
        self.dni_user.grid(row = 3, column = 1, sticky = W)
        # INPUT DOMICILIO
        Label(contenedor, text=' Domicilio: ').grid(row = 4, column = 0, padx = 20, pady = 5, sticky = W)
        self.domicilio_user = Entry(contenedor, width=45)
        self.domicilio_user.grid(row = 4, column = 1, sticky = W)
        #INPUT ESTADO
        Label(contenedor, text=' Estado: ').grid(row = 5, column = 0, padx = 20, pady = 5, sticky = W)
        self.estado = Entry(contenedor, width=45)
        self.estado.grid(row = 5, column = 1, sticky = W)
        #INPUT EMAIL
        Label(contenedor, text=' Email: ').grid(row = 6, column = 0, padx = 20, pady = 5, sticky = W)
        self.email_user = Entry(contenedor, width=45)
        self.email_user.grid(row = 6, column = 1, sticky = W)
        #INPUT PASSWORD
        Label(contenedor, text='Password: ').grid(row = 7, column = 0, padx = 20, pady = 5, sticky = W)
        self.pass_user = Entry(contenedor, width=45)
        self.pass_user.grid(row = 7, column = 1, sticky = W)
        #INPUT ROL
        Label(contenedor, text=' Rol: ').grid(row = 8, column = 0, padx = 20, pady = 5, sticky = W)
        self.rol_user = Entry(contenedor, width=45)
        self.rol_user.grid(row = 8, column = 1, sticky = W)

        #BOTON OPCIONES ADMINISTRACIÓN USUARIOS
        ttk.Button(contenedor,text="AGREGAR USUARIO",command=self.add_user).grid(row = 9, column=0)
        ttk.Button(contenedor,text="ELIMINAR",command=self.eliminar_user).grid(row=9,column=1)
        ttk.Button(contenedor,text="EDITAR ",command=self.editar_user).grid(row=9,column=2)
        ttk.Button(contenedor,text="ACTUALIZAR",command=self.mostrar_user).grid(row=9,column=3)
        ttk.Button(contenedor,text="ATRÁS",command=self.vent5.deiconify).grid(row=9,column=4)
        frame= LabelFrame(self.vent7,text="LISTA DE USUARIOS")
        frame.grid(row=0,column=0)

        self.tabla1= ttk.Treeview(frame,height=15,columns= (f"#{n}" for n in range (1,10)),selectmode=EXTENDED)
        self.tabla1.grid(row=0,column=0)
        self.tabla1.bind("<Double-Button-1>",self.doubleClickTabla1)
        #OTRA FORMA self.tabla1.config(show='headings')
        self.tabla1['show']='headings'
        self.tabla1.heading("#1",text="id_persona",anchor=CENTER)
        self.tabla1.heading("#2",text="apellido",anchor=CENTER)
        self.tabla1.heading("#3",text="nombre",anchor=CENTER)
        self.tabla1.heading("#4",text="DNI",anchor=CENTER)
        self.tabla1.heading("#5",text="domicilio",anchor=CENTER)
        #BUSCAR SOLUCION (OUT OF RANGE #6)
        self.tabla1.heading("#6",text="estado",anchor=CENTER)
        self.tabla1.heading("#7",text="email",anchor=CENTER)
        self.tabla1.heading("#8",text="password",anchor=CENTER)
        self.tabla1.heading("#9",text="rol",anchor=CENTER)

        item = self.tabla1.identify_row(0)
        self.tabla1.selection_set(item)
        self.tabla1.focus(item)
        
        self.mostrar_user()
        self.vent7.mainloop()
    def editar_user(self):
        query= "UPDATE Personas set apellido=?,nombre=?,DNI=?,domicilio=?,estado=?,email=?,password=?,rol=? where id_persona=?"
        nombre= self.tabla1.item(self.tabla1.selection())["values"][0]
        parametro=(self.apellido_user.get(),self.nombre_user.get(),self.dni_user.get(),self.domicilio_user.get(),self.estado.get(),self.email_user.get(),self.pass_user.get(),self.rol_user.get(),nombre)
        self.run_query(query,parametro)
        #Inserto los nuevos datos según mi seleccion doble click
        self.mostrar_user() 
    def add_user(self):
        #CONDICION PARA AGREGAR USUARIOS
        if self.apellido_user.get()!="" and self.nombre_user.get()!="" and self.dni_user.get()!=0 and self.domicilio_user.get()!="" and self.estado.get()!="" and self.email_user.get()!="" and self.pass_user.get()!="" and self.rol_user.get()!="":
            query= 'INSERT INTO Personas VALUES (NULL,?,?,?,?,?,?,?,?)'
            parametros= (self.apellido_user.get(),self.nombre_user.get(),self.dni_user.get(),self.domicilio_user.get(),self.estado.get(),self.email_user.get(),self.pass_user.get(),self.rol_user.get())
            self.run_query(query,parametros)
            messagebox.showinfo(title="Correcto",message="Se agregó su usuario con éxito")

        else:
            messagebox.showerror(title="ERROR",message="Los campos pedidos deben estar completos")
        self.mostrar_user()

    def eliminar_user(self):
        query= 'DELETE FROM Personas WHERE apellido= ? and DNI=?'
        nombre= self.tabla1.item(self.tabla1.selection())["values"][1]
        dni= self.tabla1.item(self.tabla1.selection())["values"][3]
        self.run_query(query,(nombre,dni))
        self.mostrar_user()
    def mostrar_user(self):
        #Limpio mi tabla
        records = self.tabla1.get_children()
        for element in records:
            self.tabla1.delete(element)

        #Tomo todos los registros existentes
        query= "SELECT * FROM Personas"
        db_rows=self.run_query(query)

        #for row in db_rows:
            #self.tabla1.insert('',0,text = row[0], values=(row[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7],row[8]))
        for i in db_rows:
            self.tabla1.insert('','end',values=i)

   
    ## VENTANA DE INVENTARIO DE ADMINISTRADOR
    def inventario(self):
        self.vent5.withdraw()
        vent6= Tk()
        self.vent6= vent6
        self.vent6.title('Inventario Super Market')
        self.vent6.geometry("1200x700")
        frame2 = LabelFrame(self.vent6, text=' LISTADO DE PRODUCTOS: ')
        frame2.grid(row = 3, column = 0, columnspan = 3, padx = 20, pady = 15)
        #CREO MI TABLA DE PRODUCTOS PARA EL INVENTARIO (ADMIN)
        self.tabla = ttk.Treeview(frame2, height = 10, columns=(f"#{n}" for n in range(0,5)))
        self.tabla.grid(row = 7, column = 0, columnspan = 2, padx = 20, pady = 10)
        #OPCION PARA QUE MUESTRE SOLO LOS HEADINGS
        #USO EL BIND PARA SELECCIONAR LOS ITEMS
        #FORMATO self.tree.bind (funcion,evento)
        self.tabla.bind("<Double-Button-1>",self.doubleClickTabla)
        self.tabla['show']='headings'
        self.tabla.heading("#1", text="Id ", anchor = CENTER)
        self.tabla.heading("#2", text="Nombre", anchor = CENTER)
        self.tabla.heading("#3", text="Precio", anchor = CENTER)
        self.tabla.heading("#4", text="Stock", anchor = CENTER)
        self.tabla.heading("#5", text="Descripción", anchor = CENTER)

        self.mostrar_prod()
        item = self.tabla.identify_row(0)
        self.tabla.selection_set(item)
        self.tabla.focus(item)
        # SCROLL VERTICAL TREEVIEW
        scrolvert = Scrollbar(frame2, command = self.tabla.yview)
        scrolvert.grid(row=7, column=2, sticky="nsew")
        self.tabla.config(yscrollcommand=scrolvert.set)

         # SCROLL HORIZONTAL TREEVIEW
        scrolhoriz = Scrollbar(frame2, command = self.tabla.xview, orient='horizontal')
        scrolhoriz.grid(row=12, column=0, columnspan=2, sticky="news")
        self.tabla.config(xscrollcommand=scrolhoriz.set)

        # BOTONES EDITAR, ELIMINAR Y BUSCAR
        self.editar=ttk.Button(self.vent6,text='EDITAR',command=self.editar).grid(row = 13, column = 2, columnspan=2, ipadx = 50, pady = 10)
        self.delete=ttk.Button(self.vent6,text='ELIMINAR',command=self.eliminar_prod).grid(row = 13, column = 1, columnspan=2, ipadx = 50, pady = 10)
        self.guardar=ttk.Button(self.vent6,text="BUSCAR NOMBRE", command=self.buscarNombre).grid(row=13,column=0,columnspan=2,ipadx=0,pady=10)
        self.guardar = ttk.Button(self.vent6, text="BUSCAR CATEGORIA", command=self.buscarCategoria).grid(row=14, column=0,columnspan=2, ipadx=0, pady=10)


        #CONTENEDOR
        contenedor= LabelFrame(self.vent6,text="Agregar un producto")
        contenedor.grid(row = 0, column = 0, columnspan = 3, pady = 15, ipadx = 5, ipady = 5)

        #INPUT BUSCAR NOMBRE
        self.buscar_nombre = Entry(vent6, width=60)
        self.buscar_nombre.grid(row=13, column = 0, padx=10, pady=5, sticky= W)

        # INPUT BUSCAR CATEGORIA
        self.buscar_categoria = Entry(vent6, width=60)
        self.buscar_categoria.grid(row=14, column=0, padx=10, pady=5, sticky=W)


        #INPUT NOMBRE
        Label(contenedor,text="Nombre: ").grid(row = 1, column = 0, padx = 20, pady = 5, sticky = W)
        self.nombre_prod = Entry(contenedor, width=25)
        self.nombre_prod.grid(row = 1, column = 1, sticky = W)
        self.nombre_prod.focus()


        #INPUT PRECIO
        Label(contenedor,text="Precio: ").grid(row=2,column=0,padx=20,pady=5,sticky=W)
        self.price = Entry(contenedor, width=25)
        self.price.grid(row = 2, column = 1, sticky = W)
        #INPUT STOCK
        Label(contenedor, text=' Stock: ').grid(row = 3, column = 0, padx = 20, pady = 5, sticky = W)
        self.stock = Entry(contenedor, width=25)
        self.stock.grid(row = 3, column = 1, sticky = W)

        # INPUT DESCRIPCION
        Label(contenedor, text=' Descripción: ').grid(row = 4, column = 0, padx = 20, pady = 5, sticky = W)
        self.descripcion = Entry(contenedor, width=45)
        self.descripcion.grid(row = 4, column = 1, sticky = W)



        #BOTON PARA AGREGAR PRODUCTO
        ttk.Button(contenedor,text="AGREGAR PRODUCTO",command=self.add_product).grid(row = 6, columnspan = 2, ipadx=40, pady = 10)
        ttk.Button(contenedor,text="Atrás",command=self.vent5.deiconify).grid (row=7,columnspan=2, ipadx=40,pady=10)
        self.vent6.mainloop()


    #EVENTO PARA CUANDO HAGO DOBLE CLICK EN MI TABLA DE PRODUCTOS
    def doubleClickTabla(self,event):
        self.nombre_anterior= str(self.tabla.item(self.tabla.selection())["values"][0])
        self.nombre_anterior= list(self.nombre_anterior)
        #Borrar los datos que esten escritos en mis Entry

        self.nombre_prod.delete(0,END)
        self.price.delete(0,END)
        self.stock.delete(0,END)
        self.descripcion.delete(0,END)
        #Inserto los nuevos datos según mi seleccion doble click
        ###self.id.insert(0,str(self.tabla.item(self.tabla.selection())["values"][0]))
        self.nombre_prod.insert(0,str(self.tabla.item(self.tabla.selection())["values"][1]))
        self.price.insert(0,str(self.tabla.item(self.tabla.selection())["values"][2]))
        self.stock.insert(0,str(self.tabla.item(self.tabla.selection())["values"][3]))
        self.descripcion.insert(0,str(self.tabla.item(self.tabla.selection())["values"][4]))
    
       
    #FUNCION DOBLE CLICK TABLA1 DE USUARIOS
    def doubleClickTabla1(self,event):
        self.usuario_anterior= str(self.tabla1.item(self.tabla1.selection())["values"][0])
        #CONVIERTO LOS DATOS LLAMADOS CON EL DOBLE CLICK EN LISTA
        #BORRO LOS DATOS QUE ESTÁN ESCRITOS EN MI ENTRY
        self.apellido_user.delete(0,END)
        self.nombre_user.delete(0,END)
        self.dni_user.delete(0,END)
        self.domicilio_user.delete(0,END)
        self.estado.delete(0,END)
        self.email_user.delete(0,END)
        self.pass_user.delete(0,END)
        self.rol_user.delete(0,END)
       
        #INSERTO LOS DATOS
        self.apellido_user.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][1]))
        self.nombre_user.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][2]))
        self.dni_user.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][3]))
        self.domicilio_user.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][4]))
        self.estado.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][5]))
        self.email_user.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][6]))
        self.pass_user.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][7]))
        self.rol_user.insert(0,str(self.tabla1.item(self.tabla1.selection())["values"][8]))


    ## FUNCION DE BUSQUEDA DE PRODUCTOS
    def buscarNombre(self):
        ##lIMPIEZA DE TABLA PARA MOSTRAR SOLO LOS PRODUCTOS DE INTERES
        record = self.tabla.get_children() ## Obtener los elementos de la tabla
        for elementos in record:
            self.tabla.delete(elementos)

        #Consultando datos
        nombre = self.buscar_nombre.get()
        query = 'SELECT * FROM Productos WHERE nombre LIKE "%'+nombre+'%" '

        db_rows = self.run_query(query)
        print(nombre)

        for row in db_rows:
            self.tabla.insert('',0,text = row[0], values=(row[0],row[1],row[2],row[3],row[4]))

    def buscarCategoria(self):
        ##lIMPIEZA DE TABLA PARA MOSTRAR SOLO LOS PRODUCTOS DE INTERES
        record = self.tabla.get_children() ## Obtener los elementos de la tabla
        for elementos in record:
            self.tabla.delete(elementos)

        #Consultando datos
        descripcion = self.buscar_categoria.get()
        query = 'SELECT * FROM Productos WHERE descripcion LIKE "%'+descripcion+'%" '

        db_rows = self.run_query(query)
        print(descripcion)

        for row in db_rows:
            self.tabla.insert('',0,text = row[0], values=(row[0],row[1],row[2],row[3],row[4]))





    #FUNCION PARA ELIMINAR PRODUCTO SELECCIONADO
    def eliminar_prod(self):
        query= 'DELETE FROM Productos WHERE nombre = ?'
        nombre= self.tabla.item(self.tabla.selection())["values"][1]
        self.run_query(query,(nombre,))
        self.mostrar_prod()



        
    #FUNCION PARA EDITAR PRODUCTOS editar
    def editar(self):
        #query="UPDATE Productos set nombre='"+self.nombre_prod.get()+"',precio='"+self.price.get()+"',stock='"+self.stock.get()+"',descripcion='"+self.descripcion.get()+"' where nombre='"+self.nombre_anterior+"'; "
        query= "UPDATE Productos set nombre=? ,precio=? ,stock=?,descripcion=? where nombre=?"
        self.nombre2= self.tabla.item(self.tabla.selection())["values"][1]
        parametro=(self.nombre_prod.get(),self.price.get(),self.stock.get(),self.descripcion.get(),self.nombre2)
        self.run_query(query,parametro)
        #Inserto los nuevos datos según mi seleccion doble click
        self.mostrar_prod()    
    #FUNCION PARA AGREGAR LOS PRODUCTOS DESDE LA APP A LA BASE DE DATOS
    def add_product(self):
        #CONDICION PARA AGREGAR PRODUCTOS
        if self.nombre_prod.get()!="" and self.price.get()!=0 and self.stock.get()!=0 and self.descripcion.get()!="":
            query= 'INSERT INTO Productos VALUES (NULL,?,?,?,?)'
            parametros=(self.nombre_prod.get(),self.price.get(),self.stock.get(),self.descripcion.get())
            self.run_query(query,parametros)
            messagebox.showinfo(title="Correcto",message="Se cargó el nuevo producto")
            self.nombre_prod.delete(0,END)
            self.price.delete(0,END)
            self.stock.delete(0,END)
            self.descripcion.delete(0,END)
            self.mostrar_prod()
        else:
            messagebox.showerror(title="Error",message="Todos los campos son requeridos")

    def volver_admin(self):
        self.vent5.deiconify()
    def Registrarse (self):
            self.wind.withdraw()
            ventana2=Tk()
            self.ventana2= ventana2
            self.ventana2.geometry("300x500")
            self.ventana2.title("Registrarse")
            self.ventana2.iconbitmap('icono.ico')
            frame=LabelFrame(self.ventana2,text="Nuevo Usuario")
            frame.pack()
            Label(frame,text="Nombre").pack()
            self.nombre=Entry(frame)
            self.nombre.pack()
            Label(frame,text="Apellido").pack()
            self.apellido=Entry(frame)
            self.apellido.pack()
            Label(frame,text="Domicilio").pack()
            self.domicilio=Entry(frame)
            self.domicilio.pack()
            Label(frame,text="Dni").pack()
            self.dni=Entry(frame)
            self.dni.pack()
            Label(frame,text="Email").pack()
            self.email=Entry(frame)
            self.email.pack()
            Label(frame,text="Contraseña").pack()
            self.contra=Entry(frame,show="*")
            self.contra.pack()
            Label(frame,text="Ingrese nuevamente la contraseña").pack()
            self.contra2=Entry(frame,show="*")
            self.contra2.pack()
            Label(frame,text="Usuario").pack()
            self.usuario=Entry(frame)
            self.usuario.pack()
            ttk.Button(frame,text="Confirmar",command=self.cargar_personas).pack()
            ttk.Button(frame,text="Atrás",command=self.regreso_vent2).pack()
            self.ventana2.mainloop()
    def regreso_vent2(self):
        self.ventana2.withdraw()
        #Volver a la ventana anterior Home
        self.wind.deiconify()
    #CONDICION PARA REGISTRARSE QUE LAS CONTRASEÑAS COINCIDAN
    def validacion(self):
        return (self.contra.get())==(self.contra2.get())
     #METODO DE CONEXION Y CONSULTA A LA BASE DE DATOS   
    def run_query(self,query,parameters=()):
            with sql.connect(db_name) as conn:
                #El cursor permite posicionarse en la base de datos
                cursor=conn.cursor()
                result=cursor.execute(query,parameters)
                conn.commit()
                #Para ejecutar LOS CAMBIOS
                return result
    def cargar_personas(self):
        #PARA CARGAR EL REGISTRO DE UN NUEVO USUARIO TENGO CONDICIONES
        #SE DEBE CUMPLIR LO PEDIDO EN LA FUNCIÓN DE VALIDACION
        if self.validacion():
            #ADEMÁS NINGUN DATO QUE SE PIDIÓ DEBE SER NULO
            if self.apellido.get()!="" and self.nombre.get()!="" and self.dni.get()!=0 and self.domicilio.get()!="" and self.email.get()!="" and self.contra.get()!="" and self.contra2.get()!="" and self.usuario.get()!="":
                query= "INSERT INTO Personas VALUES (NULL,?,?,?,?,1,?,?,1)"
                #rol 0= admin 1= cliente
                #estado 0= inactivo 1= activo
                parametros= (self.apellido.get(),self.nombre.get(),self.dni.get(),self.domicilio.get(),self.email.get(),self.contra.get())
                self.run_query(query,parametros)
                messagebox.showinfo(title="Registro correcto",message="Usted se registró correctamente")
            else:
                messagebox.showerror(title="Error",message="Es obligatorio ingresar datos en todos los campos pedidos al registrarse")
        else: 
            messagebox.showerror(title="Algo ha salido mal",message="Las contraseñas ingresadas deben coincidir")


if __name__=='__main__':
    ventana=Tk()
    app= Home(ventana)