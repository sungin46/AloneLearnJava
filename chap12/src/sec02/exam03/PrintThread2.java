package sec02.exam03;

public class PrintThread2 extends Thread{
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				//스레드가 일시정지 상태가 되어야 InterruptedException이 발생해서 sleep(1)을 걸어주었다.
				Thread.sleep(1);
			}
		}catch (InterruptedException e) {
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
