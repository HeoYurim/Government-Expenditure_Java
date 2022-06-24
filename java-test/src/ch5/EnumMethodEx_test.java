package ch5;

public class EnumMethodEx_test {

	public static void main(String[] args) {

		//name() �޼ҵ�
		Week_Test today = Week_Test.WEDNESDAY;
		String name = today.name();
		System.out.println("��ü�� �̸��� " + name);
		
		//ordinal() �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println("���� ������ " + ordinal);
		
		//compareTo() �޼ҵ�
		Week_Test day1 = Week_Test.SATURDAY;
		Week_Test day2 = Week_Test.TUESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ�
		Week_Test weekday = Week_Test.valueOf("FRIDAY");
		if(weekday == Week_Test.SATURDAY || weekday == Week_Test.SUNDAY) {
			System.out.println("�ָ��Դϴ�!!!!!!!!!!!");
		}else {
			System.out.println("����..");
		}
		
		//values() �޼ҵ�
		Week_Test[] days = weekday.values();
		for(Week_Test a : days) {
			System.out.print(a + " ");
		}
	}

}
