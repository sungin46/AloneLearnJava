package sec01.Q5;

public class Child extends Parent {
	private String name;
	
	//Parent.java와 동일하게 Child(String)이 선언되지 않으면 컴파일 오류가 발생한다.
	//따라서 Child(String)이 먼저 실행된다.
	// 오류 : The constructor Child(String) is undefined.
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
