package ch05;

public class EnumMethodEx {

	public static void main(String[] args) {
		
		//name() �޼ҵ�
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("��ü�� �̸���: " + name);
		
		//ordinal() �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println("���� ������ : " + ordinal); //Week.java�� �ִ� ����
		
		//compareTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ�
		Week weekday = Week.valueOf("MONDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("�ָ��̱���. ǫ ���ð� ���Ͽ� �����ô�!");
		}else {
			System.out.println("�����̱���. �н��� ���� 8�ð� �̻��� �ֹ����� :)");
		}
		
		//values() �޼ҵ�
		Week[] days = weekday.values(); //Week�� ���Ż���� days �迭�� ����
		for(Week a : days) {
			System.out.print(a + " ");
		}
	}

}
