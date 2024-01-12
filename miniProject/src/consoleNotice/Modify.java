package consoleNotice;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Modify {
	Menu menu = new Menu();
	Scanner scanner = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public void modify() throws Exception{
		try {
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
			case "1" : selectNumber(); break;
			case "2" : menu.showMenu(); break;
			default : {
				System.out.println("메뉴에 없습니다. 다시 입력해주세요.");
				modify();
			}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 번호입니다. 다시 입력해주세요.");
			modify();
		} catch (InputMismatchException e) {
			System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
			modify();
		} catch (NumberFormatException e) {
			System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
			modify();
		}
	}
	
	public void selectNumber() throws Exception {
		try {
			System.out.print("몇 번째 글을 수정하시겠습니까? : ");
			String modifyNum = scanner.nextLine();
			AddedList.readList().get(Integer.parseInt(modifyNum)-1); // 입력된 번호를 미리 호출해봄으로서 IndexOutOfBoundsException을 체크한다.
			selectModify(Integer.parseInt(modifyNum));
		} catch (NumberFormatException e) {
			System.out.println("한글, 영문, 특수문자는 입력할 수 없습니다. 다시 입력해주세요.");
			selectNumber();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("목록에 없는 번호입니다. 다시 입력해주세요. (인덱스 아웃 오브 바운드)");
			selectNumber();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void selectModify(int modifyNum) throws Exception {
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
			System.out.println("한글, 영문, 특수문자 혹은 메뉴에 없는 번호는 입력할 수 없습니다. 다시 입력해주세요.");
			selectModify(modifyNum);
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
