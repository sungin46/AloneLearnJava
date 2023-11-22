package finishQuestion;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("Choose > ");
			String choose = scanner.nextLine();
			switch(choose) {
			case "1":
				System.out.println("예금액> 10000\n");
				break;
			case "2": 
				System.out.println("출금액> 2000\n");
				break;
			case "3":
				System.out.println("잔고> 8000\n");
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("목록에 없습니다. 다시 입력해주세요.\n");
			}
		}
		System.out.println("프로그램 종료");
	}

}
