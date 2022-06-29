package ch11.calendarTest;

import java.util.*;

public class CalendarEx {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Chicago");
		Calendar now = Calendar.getInstance(timeZone);
		
		//.get() �޼ҵ带 �̿��Ͽ� ��¥�� �ð��� ���� ������ ��´�.
		int year = now.get(Calendar.YEAR); //�⵵�� ����
		int month = now.get(Calendar.MONTH) + 1; //0���� ���� ����
		int day = now.get(Calendar.DAY_OF_MONTH); //���� ����
		int week = now.get(Calendar.DAY_OF_WEEK); //������ ����
		
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY :{
				strWeek = "��";
				break;
			}
			case Calendar.TUESDAY :{
				strWeek = "ȭ";
				break;
			}
			case Calendar.WEDNESDAY :{
				strWeek = "��";
				break;
			}
			case Calendar.THURSDAY :{
				strWeek = "��";
				break;
			}
			case Calendar.FRIDAY :{
				strWeek = "��";
				break;
			}
			case Calendar.SATURDAY :{
				strWeek = "��";
				break;
			}
			default:{
				strWeek = "��";
			}
		}
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.println(strWeek + "���� ");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		}else {
			strAmPm = "����";
		}
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "�� ");;
	}

}
