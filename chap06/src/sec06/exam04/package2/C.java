package sec06.exam04.package2;

import sec06.exam04.package1.A;

public class C {
	A a1 = new A(true);
	//A a2 = new A(1); //default 접근 제한은 같은 패키지 내에서만 접근 가능.
	//A a3 = new A("문자열"); // private 접근 제한은 같은 클래스 내부에서만 호출 가능하다.
}
