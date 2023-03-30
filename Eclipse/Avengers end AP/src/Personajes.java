import java.util.Objects;

public abstract class  Personajes {
	private String nombre;
	private int puntosSalud;
	private int puntosAtaque;
	private int puntosDefensa;
	private int PuntosSaludMax;
	
	public Personajes(String nombre, int puntosSalud, int puntosAtaque, int puntosDefensa) {
		this.nombre = nombre;
		this.puntosSalud = puntosSalud;
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
		PuntosSaludMax = puntosSalud;
	}
	
	public Personajes(int puntosSalud, int puntosAtaque, int puntosDefensa) {
		
		this.puntosSalud = puntosSalud;
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
		PuntosSaludMax = puntosSalud;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosSalud() {
		return puntosSalud;
	}
	public void setPuntosSalud(int puntosSalud) {
		this.puntosSalud = puntosSalud;
	}
	public int getPuntosAtaque() {
		return puntosAtaque;
	}
	public void setPuntosAtaque(int puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}
	public int getPuntosDefensa() {
		return puntosDefensa;
	}
	public void setPuntosDefensa(int puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}
	public int getPuntosSaludMax() {
		return PuntosSaludMax;
	}
	public void setPuntosSaludMax(int puntosSaludMax) {
		PuntosSaludMax = puntosSaludMax;
	}
	
	
	//ATACAR
	
	public void atacar(Personaje p) {
		
	}
	
	public abstract boolean esquivar();



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personajes other = (Personajes) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public boolean estaVivo() {
		
		return this.puntosSalud > 0;
	}
	
	
}
