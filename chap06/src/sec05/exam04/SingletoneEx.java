package sec05.exam04;

public class SingletoneEx {

	public static void main(String[] args) {
//		Singletone obj1 = new Singletone();
//		Singletone obj2 = new Singletone();
		// 위의 두 코드는 컴파일 에러다.
		
		Singletone obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singletone 객체입니다.");
		}else {
			System.out.println("다른 Singletone 객체입니다.");
		}
	}

}
