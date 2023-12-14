package sec01.exam20;

public class StringTrimEx {

	public static void main(String[] args) {
		String tel1 = "      02";
		String tel2 = "123     ";
		String tel3 = "      1234    ";
		
		String telString = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(telString);
	}

}
