package consoleNotice;

import java.io.File;
import java.io.FileWriter;
import java.io.NotSerializableException;

public class SaveFile {
	Menu menu = new Menu();
	String txtPath = "/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.txt";
	File txtFile = new File(txtPath);
	
	public void saveFile() throws Exception{
		System.out.println(".db 파일을 txt 파일로 저장합니다.");
		saveTxtFile();
		menu.showMenu();
	}
	

	public void saveTxtFile() throws Exception {
		
		try {
			boolean isExists = txtFile.exists();
			if(!isExists) txtFile.createNewFile();
			
			FileWriter fileWriter = new FileWriter(txtFile);
			String list = null;
			for(Board board : AddedList.readList()) {
				// 객체로 저장하면 텍스트 파일이 깨지기 때문에 String 형태로 변환시켜 저장한다.
				list = board.getListNum()+","+board.getTitle()+","+board.getContent()+","+board.getWriter()+","+board.getDate()+"\n";
				fileWriter.write(list);
			}
			
			fileWriter.close();
			
		} catch (NotSerializableException e) {
			System.out.println("NotSerializableException 제외 발생." + e);
			menu.showMenu();
		}
		
	}
}
