package ch02;

public class PromotionEx {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue; //�ڵ�Ÿ�Ժ�ȯ
		System.out.println(intValue); //10�� ���
		
	//	byte byteValue1 = intValue; //ū Ÿ�Կ��� ���� Ÿ������ �ٲ� �� ����
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("'��'�� �����ڵ� �� = " + intValue);
		
		intValue = 500;
		long longValue = intValue; //int(4byte)�� ū Ÿ���� long(8byte)�� ��ȯ
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; //int(4byte)�� ū Ÿ���� double(8byte)�� ��ȯ
		System.out.println(doubleValue);
	}

}
