package consoleNotice;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Detail {
	Menu menu = new Menu();
	Scanner scanner = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public void detail() throws Exception {
		List<Board> addedList = AddedList.readList();
		if(addedList.isEmpty()) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("\n목록이 존재하지 않습니다.\n");
			System.out.println("----------------------------------------------------------------");
			
			menu.showMenu();
		} else {
			System.out.print("보고싶은 제목 번호를 입력하세요. (목록은 "+ addedList.size() + "번까지 존재) : ");
			try {
				String inputNum = scanner.nextLine();
				int number = Integer.parseInt(inputNum);
				Board board = AddedList.readList().get(number-1);
				System.out.println("----------------------------------------------------------------");
				System.out.println("\n제목 : " + board.getTitle() + "\n내용 : " + board.getContent() 
					+ "\n작가 : " + board.getWriter() + "\n작성일자 : " + sdf.format(board.getDate()));
				System.out.println("----------------------------------------------------------------\n");
				System.out.println("1.다른 목록 보기 | 2.돌아가기\n");
				System.out.println("----------------------------------------------------------------");
				menu.detailMenu();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("존재하지 않는 번호입니다. 다시 입력해주세요.");
				detail();
			} catch (InputMismatchException e) {
				System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
				detail();
			} catch (NumberFormatException e) {
				System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
				detail();
			}
		}
	}
	
}
