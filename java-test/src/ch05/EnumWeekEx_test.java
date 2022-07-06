package ch05;

import java.util.Calendar;

public class EnumWeekEx_test {

	public static void main(String[] args) {

		Week_Test today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: 
			today = Week_Test.SUNDAY; break;
		case 2:
			today = Week_Test.MONDAY; break;
		case 3:
			today = Week_Test.TUESDAY; break;
		case 4:
			today = Week_Test.WEDNESDAY; break;
		case 5:
			today = Week_Test.THURSDAY; break;
		case 6: 
			today = Week_Test.FRIDAY; break;
		case 7:
			today = Week_Test.SATURDAY; break;
		}
		
		System.out.println("오늘의 날짜는 " + year + "년 " + month + "월 " + day + "일 (" + today + ")");
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println("현재 시간은 " + hour + "시 " + min + "분 " + sec + "초");
	}

}
