package sec01.exam02;

public class StudentEx {

	public static void main(String[] args) {
		Student student = new Student("홍성인", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}

}
