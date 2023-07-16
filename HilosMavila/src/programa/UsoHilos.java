package programa;


public class UsoHilos {

	public static void main( String args[] ) {
		System.out.println("-----El programa iniciará-----");
		System.out.println("-----Cada hilo tiene un tiempo despues de cada uno de 1000ms-----");
		System.out.println("-----iniciando los hilos-----");
		
		
		HILO hilo1 = new HILO();
		hilo1.start();
		
		try {
			System.out.println("hilo 1");
			hilo1.sleep(1000); //va 1000
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		HILO hilo2 = new HILO();
		hilo2.start();
		
		try {
			System.out.println("hilo 2");
			hilo2.sleep(1000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HILO hilo3 = new HILO();
		hilo3.start();
		
		try {
			System.out.println("hilo 3");
			hilo3.sleep(1000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		HILO hilo4 = new HILO();
		hilo4.start();
		
		try {
			System.out.println("hilo 4");
			hilo4.sleep(1000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
}
