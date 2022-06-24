package ch5;

public class EnumMethodEx_test {

	public static void main(String[] args) {

		//name() 메소드
		Week_Test today = Week_Test.WEDNESDAY;
		String name = today.name();
		System.out.println("객체의 이름은 " + name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println("열거 순서는 " + ordinal);
		
		//compareTo() 메소드
		Week_Test day1 = Week_Test.SATURDAY;
		Week_Test day2 = Week_Test.TUESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		Week_Test weekday = Week_Test.valueOf("FRIDAY");
		if(weekday == Week_Test.SATURDAY || weekday == Week_Test.SUNDAY) {
			System.out.println("주말입니다!!!!!!!!!!!");
		}else {
			System.out.println("평일..");
		}
		
		//values() 메소드
		Week_Test[] days = weekday.values();
		for(Week_Test a : days) {
			System.out.print(a + " ");
		}
	}

}
