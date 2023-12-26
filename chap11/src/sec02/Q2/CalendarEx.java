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
		
		//답안지 추가사항
		String monthString = (month<10) ? ("0"+month) : (""+month);
		String dayString = (day<10) ? ("0"+day) : (""+day);
		String hourString = (hour<10) ? ("0"+hour) : (""+hour);
		String minuteString = (minute<10) ? ("0"+minute) : (""+minute);
		System.out.println(year + "년 " + monthString + "월 " + dayString + "일 " + dayOfWeek + "요일 " + hourString + "시 " + minuteString + "분");
	}

}
