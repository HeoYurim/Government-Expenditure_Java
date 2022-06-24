package ch09.fieldMethodAccess;

public class A {
	int field1;
	void method1() {} //바깥쪽 인스턴스 메소드
	
	static int field2; //바깥쪽 정적 필드
	static void method2() {} //바깥쪽 정적 메소드
	
	static class C{
		void method() {
//			field1 = 10; //인스턴스 필드 사용불가능
//			method1(); //인스턴스 메소드 사용불가능
			 
			field2 = 10; //정적 필드 사용가능		
			method2(); //정적 메소드 사용가능
		}
	}
	
	
	class B{ //인스턴스 멤버 클래스
		void method() {
			field1 = 10; //인스턴스 필드 사용가능
			method1(); //인스턴스 메소드 사용가능
			 
			field2 = 10; //정적 필드 사용가능		
			method2(); //정적 메소드 사용가능
		}
	}
}
