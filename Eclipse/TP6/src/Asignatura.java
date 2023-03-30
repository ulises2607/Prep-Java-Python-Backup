import java.util.*;
public class Asignatura {
	private float matematicas;
	private float lengua;
	private float historia;
	
	public Asignatura() {
		
	}
	public void setCalificaciones(float p1, float p2, float p3) {
		
		Random random = new Random();
		p1 = random.nextFloat(10+0)+0;
		p2 = random.nextFloat(10+0)+0;
		p3 = random.nextFloat(10+0)+0;
		
		setMatematicas(p1);
		setLengua(p2);
		setHistoria(p3);
		
		
	}
	public float getMatematicas() {
		return matematicas;
	}

	public void setMatematicas(float matematicas) {
		this.matematicas = matematicas;
	}

	public float getLengua() {
		return lengua;
	}

	public void setLengua(float lengua) {
		this.lengua = lengua;
	}

	public float getHistoria() {
		return historia;
	}

	public void setHistoria(float historia) {
		this.historia = historia;
	}
	
}	
