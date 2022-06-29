package ch11.autoBoxingtest;

public class AutoBoxEx {

	public static void main(String[] args) {
		//�ڵ��ڽ�
		Integer obj = 100; // Integer obj = new Integer(100);
		System.out.println("value : " + obj.intValue());
		
		System.out.println("-------------------");
		
		//���Խ� �ڵ� ��ڽ�
		int value = obj; //Integer ��ü ���� int Ÿ������ ��ڽ�
		System.out.println("value : " + value);
		
		System.out.println("-------------------");
		
		//����� �ڵ� ��ڽ�
		int result = obj + 100;
		System.out.println("value : " + result);
		
		System.out.println("-------------------");
		
		//���ڿ��� �⺻ Ÿ�� ������ ��ȯ
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("Integer : " + value1);
		System.out.println("Double : " + value2);
		System.out.println("Boolean : " + value3);
		
		System.out.println("-------------------");
		
		System.out.println("[-128 ~ 127 �ʰ����� ���]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==���: " + (obj1 == obj2));
		System.out.println("��ڽ� �� ==���: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() ���: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128 ~ 127 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==���: " + (obj3 == obj4));
		System.out.println("��ڽ� �� ==���: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() ���: " + obj3.equals(obj4));
	}

}