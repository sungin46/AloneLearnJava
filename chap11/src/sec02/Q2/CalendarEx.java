package sec02.Q2;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int dow = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		
		String dayOfWeek = "";
		switch (dow){
		case 1: {
			dayOfWeek = "일";
			break;
		}
		case 2: {
			dayOfWeek = "월";
			break;
		}
		case 3: {
			dayOfWeek = "화";
			break;
		}
		case 4: {
			dayOfWeek = "수";
			break;
		}
		case 5: {
			dayOfWeek = "목";
			break;
		}
		case 6: {
			dayOfWeek = "금";
			break;
		}
		default:
			dayOfWeek = "토";
			break;
		}
		
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + dayOfWeek + "요일 " + hour + "시 " + minute + "분");
	}

}
