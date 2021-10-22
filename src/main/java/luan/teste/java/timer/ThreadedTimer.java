package threatTest;

public class ThreadedTimer extends Thread{
	
	public ThreadedTimer () {	
	}
	
	@Override
	public void run() {
		int i = 0;
		
		//Substituir tudo dentro do while pela rotina periódica
		while (true) {
			
			i++;
			System.out.println(i);
			if (i == 5) {
				break;
			}
			
			try {
				//Delay em milisegundos
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
