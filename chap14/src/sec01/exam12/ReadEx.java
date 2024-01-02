package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("/Users/sungin/Desktop/workspace/Eclipse/test8.txt");
		
		char[] buffer = new char[100]; //배열을 생성하고
		
		while(true) {
			int readCharNum = reader.read(buffer); //배열 길이만큼 읽어서 담은 후
			if(readCharNum == -1) break;
			for(int i=0; i<readCharNum; i++) { //읽은 문자만큼 반복하면서 배열에 저장된 문자 출력
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
