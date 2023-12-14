package sec01.exam16;

public class StringLengthEx {

	public static void main(String[] args) {
		String ssn = "9612341032234";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞음");
		}else {
			System.out.println("주민번호 자리수가 맞지 않음");
		}
	}

}
