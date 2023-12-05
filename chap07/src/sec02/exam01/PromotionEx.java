package sec02.exam01;

class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//아래 두 개는 상속관계에 있지 않아 컴파일 에러가 발생한다.
		//B b2 = e;
		//C c2 = d;
	}

}
