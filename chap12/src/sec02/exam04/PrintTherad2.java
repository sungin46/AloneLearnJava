package sec02.exam04;

public class PrintTherad2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("실행 중");
			//sleep 없이 interrupted 발생시키기
			if(PrintTherad2.interrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
