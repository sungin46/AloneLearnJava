package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed +=10;
	}
	
	// final 함수로 선언되었기 때문에 오버라이딩 할 수 없다.
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
