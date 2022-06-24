package ch05;

public class EnumMethodEx {

	public static void main(String[] args) {
		
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("객체의 이름은: " + name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println("열거 순서는 : " + ordinal); //Week.java에 있는 순서
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		Week weekday = Week.valueOf("MONDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말이군요. 푹 쉬시고 평일에 힘냅시다!");
		}else {
			System.out.println("평일이군요. 학습을 위해 8시간 이상은 주무세요 :)");
		}
		
		//values() 메소드
		Week[] days = weekday.values(); //Week에 열거상수를 days 배열로 생성
		for(Week a : days) {
			System.out.print(a + " ");
		}
	}

}
