package ch10.throwsEx;

public class ThrowsEx {

	public static void main(String[] args) {
		
		try {
			findClass();
			
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}
	private static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		System.out.println(clazz + "�� �����մϴ�.");
	}
	

}
