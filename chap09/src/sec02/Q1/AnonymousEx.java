package sec02.Q1;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(
			new Worker() {
				@Override
				public void start() {
					System.out.println("테스트를 합니다.");
				}
			}
		);
	}

}
