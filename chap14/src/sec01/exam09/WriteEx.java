package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("/Users/sungin/Desktop/workspace/Eclipse/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		//배열의 1번 인덱스부터 3개 출력
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}

}
