package sec02.exam02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		//자동 타입 변환
		Parent parent = child;
		parent.method1();
		parent.method2();
		
		//호출 불가능
		//Parent에는 method3가 없는데, 위에서 Child가 Parent로 자동 타입변환 되면서 Parent에 존재하지 않는 method3를 호출할 수 없게 되었다.
		//parent.method3();
	}

}
