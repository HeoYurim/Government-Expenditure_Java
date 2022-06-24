package ch10.throwsEx;

public class ThrowsEx {

	public static void main(String[] args) {
		
		try {
			findClass();
			
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	private static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		System.out.println(clazz + "가 존재합니다.");
	}
	

}
