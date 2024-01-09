package consoleNotice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class BoardList {
	private int counter;
	
	Menu menu = new Menu();
	List<Board> boardList = new ArrayList<Board>();
	Scanner scanner = new Scanner(System.in);
	
	public void list() throws Exception {
		List<Board> addedList = readList();
		if(addedList.isEmpty()) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("\n목록이 존재하지 않습니다.\n");
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.목록 추가 | 2.돌아가기");
			System.out.println("----------------------------------------------------------------");
			
			listMenu();
		} else {
			for(Board board : addedList) {
				System.out.println(board.getListNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter());
			}
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.목록 추가 | 2.돌아가기");
			System.out.println("----------------------------------------------------------------");
			
			listMenu();
		}
	}
	
	public void addList() throws Exception {
		System.out.println("타이틀, 내용, 작가를 순서대로 입력하세요.");
		boardList.add(new Board(++counter, scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
		FileOutputStream fos = new FileOutputStream("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(boardList);
		oos.flush();
		oos.close();
		list();
	}
	
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
	
	public void listMenu() throws Exception {
		System.out.print("선택 : ");
		String number = scanner.nextLine();
		switch (number) {
		case "1" : addList(); break;
		case "2" : menu.showMenu(); break;
		default : {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			list();
			break;
		}
		}
	}
}
