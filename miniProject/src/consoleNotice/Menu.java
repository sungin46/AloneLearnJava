package consoleNotice;

import java.io.*;
import java.util.*;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	File file = new File("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
	byte[] byteBuff = new byte[9999];
	
	public void showMenu() throws Exception {
		BoardList boardList = new BoardList();
		Detail detail = new Detail();
		Modify modify = new Modify();
		Delete delete = new Delete();
		SaveFile saveFile = new SaveFile();

		Scanner scanner = new Scanner(System.in);

		boolean isExists = file.exists();
		if(!isExists) file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
	    int nRLen = bis.read(byteBuff);
	    if(nRLen < 0) {
	    	System.out.println("------------------------");
	    	System.out.println("리스트가 존재하지 않습니다!\n리스트 하나를 우선 등록해주세요!");
	    	System.out.println("------------------------");
	    	firstAddList();
	    } else {
	    	System.out.println("--------------------------------------------------------------------");
			System.out.println("1.목록보기 | 2.상세보기 | 3.수정하기 | 4.삭제하기 | 5.파일 텍스트로 저장 | 6.종료");
			System.out.println("--------------------------------------------------------------------");

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
		}
		
		scanner.close();
	}

	public void firstAddList() throws Exception {
		try {
			List<Board> newList = new ArrayList<Board>();
			System.out.println("타이틀, 내용, 작가를 순서대로 입력하세요.");
			newList.add(new Board(1, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), new Date()));
			
			AddedList.writeFile(newList);
			showMenu();
		} catch (Exception e) {
			System.out.println("에러입니다. 에러 내용 : " + e);
		}
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
			listMenu();
			break;
		}
		}
	}
	
	public void detailMenu() throws Exception {
		Detail detail = new Detail();
		System.out.print("선택 : ");
		String number = scanner.nextLine();
		switch (number) {
		case "1" : detail.detail(); break;
		case "2" : showMenu(); break;
		default : {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			detailMenu();
			break;
		}
		}
	}
	
	public void modifyMenu() throws Exception {
		Modify modify = new Modify();
		System.out.print("선택 : ");
		String number = scanner.nextLine();
		switch (number) {
		case "1": modify.selectNumber(); break;
		case "2": showMenu(); break;
		default:
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			modifyMenu();
			break;
		}
	}
}
