package practicaboludeando;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
		int segundos= 0;
		int minutos = 0;
		int horas = 0;
		int dias;
		int mes;
		int años;
		
		boolean salir = false;
		// aumentar el tiempo
		while(!salir) {
		
//Mostrar
			
			if(horas<10) {
				System.out.print("0");
			}
			System.out.print(horas+":");
			
			if(minutos<10) {
				System.out.print("0");
			}
			System.out.print(minutos+":");
			
			if(segundos<10) {
				System.out.print("0");
			}
			
			// aumentar el tiempo
			System.out.println(segundos);
		segundos++;
		
		//Comprobar el tiempo
		
		if (segundos == 60) {
			segundos = 0;
			minutos++;
			if(minutos == 60) {
				minutos = 0;
				horas++;
				if(horas == 24) {
					horas = 0;
				}
			}
		}
		
		//frecuencia de loop
		Thread.sleep(1000);
		}
		
		
		}
	
	}


