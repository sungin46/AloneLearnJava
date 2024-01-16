package consoleNotice;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Delete {
	Menu menu = new Menu();
	Scanner scanner = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public void delete() throws Exception{
		try {
			List<Board> addedList = AddedList.readList();
			System.out.println("----------------------------------------------------------------");
			for(Board board : addedList) {
				System.out.println(board.getListNum() + "\t" + board.getTitle() + "\t" + board.getContent()
				+ "\t" + board.getWriter() + "\t" + sdf.format(board.getDate()));
			}
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. 삭제할 번호 선택 | 2. 돌아가기");
			System.out.println("----------------------------------------------------------------");
			menu.deleteMenu();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 번호입니다. 다시 입력해주세요.");
			delete();
		} catch (InputMismatchException e) {
			System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
			delete();
		} catch (NumberFormatException e) {
			System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
			delete();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void selectNumber() throws Exception {
		try {
			System.out.print("몇 번째 글을 삭제하시겠습니까? : ");
			String deleteNum = scanner.nextLine();
			AddedList.readList().get(Integer.parseInt(deleteNum)-1);
			deleteList(Integer.parseInt(deleteNum)-1);
		} catch (NumberFormatException e) {
			System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
			selectNumber();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("목록에 없는 번호입니다. 다시 입력해주세요. (인덱스 아웃 오브 바운드)");
			selectNumber();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("에러 발생으로 인해 프로그램이 종료됩니다.");
		}
	}
	
	public void deleteList(int deleteNum) throws Exception {
		try {
			List<Board> boards = AddedList.readList();
			Board getBoard = boards.get(deleteNum);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("제목 : " + getBoard.getTitle() + "\n내용 : " + getBoard.getContent() + "\n작가 : " + getBoard.getWriter());
			System.out.println("정말로 삭제하시겠습니까?");
			System.out.println("1. Yes | 2. No (메인으로)");
			String number = scanner.nextLine();
			switch (number) {
			case "1": {
				boards.remove(deleteNum);
				AddedList.writeFile(boards);
				System.out.println("성공적으로 삭제되었습니다!");
				menu.showMenu();
				break;
			}
			case "2": menu.showMenu(); break;
			default:{
				System.out.println("한글, 영문, 특수문자 혹은 메뉴에 없는 번호는 입력할 수 없습니다. 다시 입력해주세요.");
				deleteList(deleteNum);
			}
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("에러 발생으로 인해 프로그램이 종료됩니다.");
		}
	}
}
