package sec01.exam18;

public class StringSubstringEx {

	public static void main(String[] args) {
		String ssn = "960103-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
