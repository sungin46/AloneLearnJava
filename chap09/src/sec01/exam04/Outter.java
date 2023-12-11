package sec01.exam04;

public class Outter {
	//자바 8 이후는 final을 붙이지 않아도 int arg, int localVariable 앞에 final 특성을 가지게 해준다.
	public void method(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
