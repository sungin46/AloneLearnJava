package sec01.Q5;

public class Parent {
	public String nation;
	
	// 서순을 보면 이 함수가 먼저 실행되어야 하지만
	// Parent(String)이 먼저 선언되어야 하므로 밑의 함수가 먼저 실행되고 Parent() 함수가 실행된다.
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
