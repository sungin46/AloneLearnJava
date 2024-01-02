package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("/Users/sungin/Desktop/workspace/Eclipse/test7.txt");
		
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.println((char)data);
		}
		reader.close();
	}

}
