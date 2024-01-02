package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("/Users/sungin/Desktop/workspace/Eclipse/test2.db");
		
		byte[] buffer = new byte[100];
		while(true) {
			int readByteNum = is.read(buffer);
			if(readByteNum == -1) break;
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
