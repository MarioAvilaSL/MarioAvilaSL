package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HILO extends Thread{
	
	@Override
	public void run() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
		
			for (int contar=1; contar<=5; contar++){
		System.out.println("La fecha y ahora actual del sistema es: "+date.format(LocalDateTime.now()));
			try {
				sleep(0); //va 0
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			System.out.println("El hilo a terminado.");//este
			System.out.println("\n");//este
    }
}