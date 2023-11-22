package sec01.exam06;

public class SwitchNoBreakCaseExam {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8; //8~11 사이의 정수
		System.out.println("[현재 시각 : " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근하자.");
		case 9:
			System.out.println("회의하자.");
		case 10:
			System.out.println("업무하자.");
		default:
			System.out.println("외근가자.");
		}
	}

}
