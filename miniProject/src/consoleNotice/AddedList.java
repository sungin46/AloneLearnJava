package consoleNotice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class AddedList {
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
	
	public static void writeFile(List<Board> boards) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/sungin/Desktop/workspace/Eclipse/consoleBoard.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(boards);
		oos.flush();
		oos.close();
	}
}
