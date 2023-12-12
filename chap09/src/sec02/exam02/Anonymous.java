package sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켜자");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끄자");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켜자");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끄자");
			}
		};
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
