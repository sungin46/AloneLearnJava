package consoleNotice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class AddedList {
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
}
