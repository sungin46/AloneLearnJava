package sec02.exam01;

public class TryCatchFinallyEx {

	public static void main(String[] args) {
		try {
			//forName으로 주어진 클래스가 존재하면 Class 객체를 리턴
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
