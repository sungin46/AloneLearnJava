package sec01.exam13;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVal1 = new String("홍성인");
		String strVal2 = "홍성인";
		
		if(strVal1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
