package Ejercicio7;

public class Producto {
	private int id;
	private String nombre;
	private String categoria;
	private float precio;
	private int stock;
	public Producto(int id, String nombre, String categoria, float precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public boolean validarStock() {
		boolean valStock = false;
		if(getStock() > 0) {
			return valStock = true;
		}else {
			return valStock = false;
		}
		
	}
	public void vender(String n) {
		
		if(n.validarStock()==true) {
			
		}
	}
	
}
