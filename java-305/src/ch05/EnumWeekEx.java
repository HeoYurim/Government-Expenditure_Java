package ch05;

import java.util.Calendar; //내장된 클래스를 활용할 때 사용, 자동으로 안들어갈 땐 ctrl + shift + o

public class EnumWeekEx {

	public static void main(String[] args) {
		
		Week today = null; //Week 타입에 today 변수를 선언하고 연결은 나중에 하겠다.
		
		Calendar cal = Calendar.getInstance(); //캘린더 인스턴스 생성
		
		int year = cal.get(Calendar.YEAR); //년도를 얻어온다.			
		int month = cal.get(Calendar.MONTH) + 1; //컴퓨터는 0이 시작이라 +1을 진행		
		int day = cal.get(Calendar.DAY_OF_MONTH); //한 달에 일수가 계산		
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일을 숫자로 출력한다. 일요일이 1
	
		switch(week) {
		case 1 : 
			today = Week.SUNDAY ; break;
		case 2 : 
			today = Week.MONDAY ; break;
		case 3 : 
			today = Week.TUESDAY ; break;
		case 4 : 
			today = Week.WEDNESDAY ; break;
		case 5 : 
			today = Week.THURSDAY ; break;
		case 6 : 
			today = Week.FRIDAY ; break;
		case 7 : 
			today = Week.SATURDAY ; break;
		}
		
		System.out.println("현재 날짜는 : " + year + "년 " +  month + "월 " + day + "일 (" + today + ")");
		
		int hour = cal.get(Calendar.HOUR); //시간
		int minute = cal.get(Calendar.MINUTE); //분
		int second = cal.get(Calendar.SECOND); //초
	
		System.out.println("현재 시간은 : " + hour + "시 " +  minute + "분 " + second + "초");
		
		//요일별 스케줄(일일 학습목표)
		if(today == Week.SUNDAY) {
			System.out.println("일요일입니다. 열심히 쉽시다!");
		}else if(today == Week.MONDAY) {
			System.out.println("월요일입니다. 열심히 국비 공부 하러 갑시다....");
		}else if(today == Week.TUESDAY) {
			System.out.println("화요일입니다. 열심히 운동합시다...");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("수요일입니다. 열심히 삽시다. 주말 이틀 남았습니다!!");
		}else if(today == Week.THURSDAY) {
			System.out.println("목요일입니다. 열심히 하루를 버팁시다.");
		}else if(today == Week.FRIDAY) {
			System.out.println("금요일입니다. 열심히 끝내고 화려하게 놉시다!!!!!");
		}else if(today == Week.SATURDAY) {
			System.out.println("토요일입니다. 열심히 놉시다! 우리에겐 하루가 더 남았습니다~");
		}
		
		
		
		/*
		Week today = Week.SUNDAY;
		System.out.println(today == Week.SUNDAY); //변수 값과 객체 주소가 같다.
		
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println(week1 == week2); //Week 타입에 열거 상수를 대입해도 객체는 같다.
		*/
	}

}
