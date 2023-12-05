package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class C {
	public void method() {
		// 다른 패키지에서는 protected로 선언된 필드, 생성자, 메소드에 접근할 수 없다.
		A a = new A();
		a.field = "value";
		a.method();
	}
}
