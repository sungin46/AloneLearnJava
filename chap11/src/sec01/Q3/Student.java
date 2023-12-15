package sec01.Q3;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	// 내 정답
//	int score;
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student compareStudent = (Student)obj;
//			if(this.studentNum == compareStudent.studentNum) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return score;
//	}
	
	// 답지 정답
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
