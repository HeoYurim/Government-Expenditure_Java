package ch2;

public class PromotionEx_test {

	public static void main(String[] args) {

		//byte���� �־����� �� int ������ �ڵ���ȯ�Ͽ� int �� ���
		byte byteValue = 55;
		int intValue = (int)byteValue;
		System.out.println(byteValue);
		
		//char���� �־����� �� ���� �����ڵ带 ���
		char charValue = '��';
		intValue = charValue;
		System.out.println("'��'�� �����ڵ� ���� = " + intValue);
		
		//int���� �־����� �� long �� ���
		intValue = 300;
		long longValue = (long)intValue;
		System.out.println(longValue);
		
		//int���� �־����� �� double�� ���
		intValue = 200;
		double doubleValue = (double)intValue;
		System.out.println(doubleValue);
		
	}

}
