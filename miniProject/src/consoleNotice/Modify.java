package consoleNotice;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Modify {
	Menu menu = new Menu();
	Scanner scanner = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public void modify() throws Exception{
		List<Board> addedList = AddedList.readList();
		System.out.println("----------------------------------------------------------------");
		for(Board board : addedList) {
			System.out.println(board.getListNum() + "\t" + board.getTitle() + "\t" + board.getContent()
			+ "\t" + board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("1. 수정하기 | 2. 돌아가기");
		System.out.println("----------------------------------------------------------------");
		System.out.print("선택 : ");
		String number = scanner.nextLine();
		switch(number) {
		case "1" : selectModify(); break;
		case "2" : menu.showMenu(); break;
		default : {
			
		}
		}
	}
	
	public void selectModify() {
		try {
			System.out.print("몇 번째 글을 수정하시겠습니까? : ");
			int modifyNum = Integer.parseInt(scanner.nextLine());
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. Title | 2. Content | 3. Writer | 4. ALL");
			System.out.println("----------------------------------------------------------------");
			System.out.print("어느 부분을 수정하시겠습니까? : ");
			String number = scanner.nextLine();
			switch (number) {
			case "1": modifyTitle(modifyNum); break;
			case "2": modifyContent(modifyNum); break;
			case "3": modifyWriter(modifyNum);break;
			case "4": modifyAll(modifyNum); break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + number);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void modifyAll(int modifyNum) throws Exception {
		Board modifyList = AddedList.readList().get(modifyNum - 1);
		System.out.println("전체 수정 - " + modifyNum);
	}
	
	public void modifyTitle(int modifyNum) throws Exception {
		Board modifyList = AddedList.readList().get(modifyNum - 1);
		System.out.println("타이틀 수정 - " + modifyNum);
	}
	
	public void modifyContent(int modifyNum) throws Exception {
		Board modifyList = AddedList.readList().get(modifyNum - 1);
		System.out.println("컨텐츠 수정 - " + modifyNum);
	}
	
	public void modifyWriter(int modifyNum) throws Exception {
		Board modifyList = AddedList.readList().get(modifyNum - 1);
		System.out.println("작가 수정 - " + modifyNum);
	}
}
