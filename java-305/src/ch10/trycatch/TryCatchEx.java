package ch10.trycatch;

public class TryCatchEx {

	public static void main(String[] args) {

	//	Class clazz1 = Class.forName("java.lang.String");
		
		try { //예외 발생문
			Class clazz2 = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) { //예외 발생 실행문
			System.out.println("클래스가 존재하지 않습니다.");
		}	
	}
}
