package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("/Users/sungin/Desktop/workspace/Eclipse/test3.db");
		
		byte[] buffer = new byte[5];
		
		//입력 스트림으로부터 3byte를 읽고 buffer[2], buffer[3], buffer[4]에 저장
		int readByteNum = is.read(buffer, 2, 3);
		if(readByteNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
