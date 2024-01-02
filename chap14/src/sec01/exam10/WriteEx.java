package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("/Users/sungin/Desktop/workspace/Eclipse/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}

}
