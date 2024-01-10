package consoleNotice;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BoardList {
	Menu menu = new Menu();
	Scanner scanner = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private int counter;
	
	public void list() throws Exception {
		List<Board> addedList = AddedList.readList();
		for(Board board : addedList) {
			System.out.println(board.getListNum() + "\t" + board.getTitle() + "\t" + board.getContent()
			+ "\t" + board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("1.목록 추가 | 2.돌아가기");
		System.out.println("----------------------------------------------------------------");
		menu.listMenu();		
	}
	
	public void addList() throws Exception {
		try {
			List<Board> addedList = AddedList.readList();
			counter = addedList.size(); //추가할 때 카운터 변수에 리스트의 사이즈 저장
			System.out.println("타이틀, 내용, 작가를 순서대로 입력하세요.");
			addedList.add(new Board(++counter, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), new Date()));
			FileOutputStream fos = new FileOutputStream("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(addedList);
			oos.flush();
			oos.close();
			list();
		} catch (EOFException e) {
			System.out.println("EOFException 에러입니다.");
		} catch (Exception e) {
			System.out.println("에러입니다. 에러 내용 : " + e);
		}
	}
	
}
