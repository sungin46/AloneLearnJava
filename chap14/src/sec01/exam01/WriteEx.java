package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("/Users/sungin/Desktop/workspace/Eclipse/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.flush();
		// 출력 스트림을 닫음
		os.close();
	}

}
