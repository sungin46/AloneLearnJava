package sec02.exam04;

public class InterruptEx {

	public static void main(String[] args) {
		Thread thread = new PrintTherad2();
		thread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		thread.interrupt();
	}

}
