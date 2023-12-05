package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

// A를 상속받으면 protected 필드, 생성자, 메소드에 접근 가능하다.
public class D extends A{
	public D() {
		// 하지만 new 연산자를 통해서는 할 수 없고, super()를 통해 생성자를 호출할 수 있다.
		super();
		this.field = "value";
		this.method();
	}
}
