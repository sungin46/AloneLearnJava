package sec01.exam03;

public class IfElseIfElseExam {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >=90) {
			System.out.println("A등급입니다.");
		}else if(score >=80) {
			System.out.println("B등급입니다.");
		}else if(score >= 70) {
			System.out.println("C등급입니다.");
		}else {
			System.out.println("구제불능이군요. D등급입니다.");
		}
	}

}
