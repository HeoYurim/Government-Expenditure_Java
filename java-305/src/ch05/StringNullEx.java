package ch05;

public class StringNullEx {

	public static void main(String[] args) {
		
		String strVar1 = "������";
		String strVar2 = "����";
		String strVar3 = new String("������");
		
		if(strVar1== strVar2) {
			System.out.println("strVal1�� strVal2�� ������ �����ϴ�.");
		}else {
			System.out.println("strVal1�� strVal2�� ������ �ٸ��ϴ�.");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVal1�� strVal2�� ���ڿ��� �����ϴ�.");
		}else {
			System.out.println("strVal1�� strVal2�� ���ڿ��� �ٸ��ϴ�.");
		}
		if(strVar1.equals(strVar3)) {
			System.out.println("strVal1�� strVal3�� ���ڿ��� �����ϴ�.");
		}else {
			System.out.println("strVal1�� strVal3�� ���ڿ��� �ٸ��ϴ�.");
		}
		if(strVar3.equals(strVar3)) {
			System.out.println("strVal3�� strVal3�� ���ڿ��� �����ϴ�.");
		}else {
			System.out.println("strVal3�� strVal3�� ���ڿ��� �ٸ��ϴ�.");
		}
		
	
		/*
		String name = null;
		name = "������";
		String hobby = "����";
		
		System.out.println("name �� ���� �� : " + name.length());
		System.out.println("hobby �� ���� �� : " + hobby.length());
		*/
	}

}
