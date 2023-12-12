package sec02.exam01;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체 필드 사용
		anony.field.wake();
		
		//익명 객체 로컬 변수 사용
		anony.method1();
		
		//익명 객체 매개값 사용
		anony.method2(
			//매개값으로 익명 객체 대입
			new Person() {
				void study() {
					System.out.println("공부하자");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어나자");
					study();
				}
			}
		);
	}

}
