package sec02.Q2;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberEx {

	public static void main(String[] args) throws Exception {
		String filePath = "/Users/sungin/git/AloneLearnJava/chap14/src/sec02/Q2/AddLineNumberEx.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int i = 0;
		String str;
		while((str=br.readLine()) != null) {
			System.out.println(++i + ": " + br.readLine());
		}
		br.close();
	}

}
