package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("/Users/sungin/Desktop/workspace/Eclipse/test1.db");
		while(true) {
			//1byte씩 읽기
			int data = is.read();
			//파일 끝에 도달하면 break;
			if(data == -1) break;
			System.out.println(data);
		}
		is.close();
	}

}
