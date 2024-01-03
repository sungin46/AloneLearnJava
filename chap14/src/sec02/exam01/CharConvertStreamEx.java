package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharConvertStreamEx {

	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용해보자.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		//FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
		FileOutputStream fos = new FileOutputStream("/Users/sungin/Desktop/workspace/Eclipse/text1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
		//FileInputStream에 InputStreamReader 보조 스트림을 연결
		FileInputStream fis = new FileInputStream("/Users/sungin/Desktop/workspace/Eclipse/text1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer); //InputStreamReader 보조 스트림을 이용해서 문자 입력
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
