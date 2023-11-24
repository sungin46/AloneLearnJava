package sec01.exam01;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVar1 = "홍성인";
		String strVar2 = "홍성인";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같다.");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다르다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같다");
		}
		
		String strVar3 = new String("Sungin");
		String strVar4 = new String("Sungin");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같다.");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다르다.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같다.");
		}
	}

}
