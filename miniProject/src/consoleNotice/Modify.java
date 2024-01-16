package consoleNotice;

import java.text.SimpleDateFormat;
import java.util.Date;
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
			System.out.println("1. 수정할 번호 선택 | 2. 돌아가기");
			System.out.println("----------------------------------------------------------------");
			menu.modifyMenu();
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
			selectModify(Integer.parseInt(modifyNum) - 1);
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
		// get까지 붙으면 List로 가져오지 못하니 List 객체로 가져올 수 있도록 한다.
		List<Board> modifyList = AddedList.readList();
		System.out.println("현재 제목 : " + modifyList.get(modifyNum).getTitle());
		System.out.println("현재 내용 : " + modifyList.get(modifyNum).getContent());
		System.out.println("현재 작가 : " + modifyList.get(modifyNum).getWriter());
		System.out.println("수정할 제목, 내용, 작가를 순서대로 입력해주세요.");
		modifyList.set(modifyNum, new Board((modifyNum+1), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), new Date()));
		
		AddedList.writeFile(modifyList);
		
		System.out.println(modifyList.get(modifyNum).getTitle() + "," + modifyList.get(modifyNum).getContent() + ", " + modifyList.get(modifyNum).getWriter() + ", " + modifyList.get(modifyNum).getDate());
		System.out.println("성공적으로 수정되었습니다!");
		menu.showMenu();
	}
	
	public void modifyTitle(int modifyNum) throws Exception {
		List<Board> modifyTitle = AddedList.readList();
		Board board = modifyTitle.get(modifyNum);
		System.out.println("현재 제목 : " + modifyTitle.get(modifyNum).getTitle());
		System.out.println("수정할 제목을 입력해주세요.");
		modifyTitle.set(modifyNum, new Board((modifyNum + 1), scanner.nextLine(), board.getContent(), board.getWriter(), new Date()));
		
		AddedList.writeFile(modifyTitle);
		
		System.out.println(modifyTitle.get(modifyNum).getTitle() + "," + modifyTitle.get(modifyNum).getContent() + ", " + modifyTitle.get(modifyNum).getWriter() + ", " + modifyTitle.get(modifyNum).getDate());
		menu.showMenu();
	}
	
	public void modifyContent(int modifyNum) throws Exception {
		List<Board> modifyContent = AddedList.readList();
		Board board = modifyContent.get(modifyNum);
		System.out.println("현재 내용 : " + modifyContent.get(modifyNum).getContent());
		System.out.println("수정할 내용을 입력해주세요.");
		modifyContent.set(modifyNum, new Board((modifyNum + 1), board.getTitle(), scanner.nextLine(), board.getWriter(), new Date()));
		
		AddedList.writeFile(modifyContent);
		
		System.out.println(modifyContent.get(modifyNum).getTitle() + "," + modifyContent.get(modifyNum).getContent() + ", " + modifyContent.get(modifyNum).getWriter() + ", " + modifyContent.get(modifyNum).getDate());
		menu.showMenu();
	}
	
	public void modifyWriter(int modifyNum) throws Exception {
		List<Board> modifyWriter = AddedList.readList();
		Board board = modifyWriter.get(modifyNum);
		System.out.println("현재 작가 : " + modifyWriter.get(modifyNum).getWriter());
		System.out.println("수정할 작가를 입력해주세요.");
		modifyWriter.set(modifyNum, new Board((modifyNum + 1), board.getTitle(), board.getContent(), scanner.nextLine(), new Date()));
		
		AddedList.writeFile(modifyWriter);
		
		System.out.println(modifyWriter.get(modifyNum).getTitle() + "," + modifyWriter.get(modifyNum).getContent() + ", " + modifyWriter.get(modifyNum).getWriter() + ", " + modifyWriter.get(modifyNum).getDate());
		menu.showMenu();
		
	}
}
