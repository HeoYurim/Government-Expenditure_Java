package ch09.nestedclass;

public class A {
	
	A(){System.out.println("A객체 생성");}
	
	//인스턴스 멤버 클래스
	class B{
		int field1; //인스턴스 필드
//		static int field2; //정적 필드 불가
		
		B(){System.out.println("B객체 생성");} //생성자
		
		void method1() {
			//인스턴스 메소드
		}
		
		/*
		static void method2() {
			//정적 메소드
		}
		*/
	}
	
	static class C{
		int field1; //인스턴스 필드
		static int field2; //정적 필드
		void method1() {} //인스턴스 메소드
		static void method2() {}; //정적 메소드
		C(){System.out.println("C객체 생성");} //생성자
	} //정적 멤버 클래스는 모든 멤버를 만듬
	
	void metod() { //A클래스 안쪽 메소드
		//로컬 클래스
		class D{
			
			D(){System.out.println("D객체 생성");} //생성자
			int field1;
	//		static int field2;
			
			void method1() {}
	//		static void method2() {}
			
		}
	D d = new D(); //메소드 내부에서만 호출
	d.field1 = 3; //인스턴스 필드 사용가능
	d.method1(); //인스턴스 메소드
	}
}
