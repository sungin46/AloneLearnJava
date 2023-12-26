package sec02.Q1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date nowDate = new Date();
		String nowString = nowDate.toString();
		System.out.println(nowString);
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String sdf = simple.format(nowDate);
		System.out.println(sdf);
	}

}
