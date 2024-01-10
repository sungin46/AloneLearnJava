package consoleNotice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class BoardList {
	private int counter;
	
	Menu menu = new Menu();
	List<Board> boardList = new ArrayList<Board>();
	Scanner scanner = new Scanner(System.in);
	
	public void list() throws Exception {
		List<Board> addedList = AddedList.readList();
		if(addedList.isEmpty()) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("\n목록이 존재하지 않습니다.\n");
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.목록 추가 | 2.돌아가기");
			System.out.println("----------------------------------------------------------------");
			
			menu.listMenu();
		} else {
			for(Board board : addedList) {
				System.out.println(board.getListNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter());
			}
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.목록 추가 | 2.돌아가기");
			System.out.println("----------------------------------------------------------------");
			
			menu.listMenu();
		}
	}
	
	public void addList() throws Exception {
		List<Board> addedList = AddedList.readList();
		System.out.println("타이틀, 내용, 작가를 순서대로 입력하세요.");
		addedList.add(new Board(++counter, scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
		FileOutputStream fos = new FileOutputStream("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(addedList);
		oos.flush();
		oos.close();
		list();
	}
	
}
