package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("/Users/sungin/Desktop/workspace/Eclipse/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer);
		if(readCharNum != -1) {
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
