package ch10.trycatch;

public class TryCatchEx {

	public static void main(String[] args) {

	//	Class clazz1 = Class.forName("java.lang.String");
		
		try { //���� �߻���
			Class clazz2 = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) { //���� �߻� ���๮
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}	
	}
}
