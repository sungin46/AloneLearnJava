package consoleNotice;

import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	
	public void showMenu() throws Exception {
		BoardList boardList = new BoardList();
		Detail detail = new Detail();
		Modify modify = new Modify();
		Delete delete = new Delete();
		SaveFile saveFile = new SaveFile();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("----------------------------------------------------------------");
		System.out.println("1.목록보기 | 2.상세보기 | 3.수정하기 | 4.삭제하기 | 5.파일저장 | 6.종료");
		System.out.println("----------------------------------------------------------------");
	
		System.out.print("선택 : ");
		String number = scanner.nextLine();
	
		switch(number) {
		case "1": boardList.list(); break;
		case "2": detail.detail(); break;
		case "3": modify.modify(); break;
		case "4": delete.delete(); break;
		case "5": saveFile.saveFile(); break;
		case "6": scanner.close(); return;
		default : {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			showMenu();
			}
		}
		
		scanner.close();
	}
	
	public void listMenu() throws Exception {
		BoardList boardList = new BoardList();
		System.out.print("선택 : ");
		String number = scanner.nextLine();
		switch (number) {
		case "1" : boardList.addList(); break;
		case "2" : showMenu(); break;
		default : {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			boardList.list();
			break;
		}
		}
	}
	
	public void detailMenu() throws Exception {
		Detail detailList = new Detail();
		System.out.print("선택 : ");
		String number = scanner.nextLine();
	}
}
