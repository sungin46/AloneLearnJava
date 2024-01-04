package consoleNotice;

import java.util.Scanner;

public class Menu {
	public static void showMenu(){
		List showList = new List();
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
		case "1": showList.list(); break;
		case "2": detail.detail(); break;
		case "3": modify.modify(); break;
		case "4": delete.delete(); break;
		case "5": saveFile.saveFile(); break;
		case "6": return;
		}
	}
}
