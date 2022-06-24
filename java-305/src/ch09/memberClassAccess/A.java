package ch09.memberClassAccess;

public class A {
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	/*인스턴스 멤버 클래스 B는 바깥 클래스의 인스턴스 필드(field1)의 초기값이나
	  인스턴스 메소드(method1())에서 객체를 생성할 수 있다.*/
	
	void method1() { //인스턴스 메소드
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드 초기화
//	static B field3 = new B(); //불가능 (인스턴스 멤버 클래스)
	static C field4 = new C(); //가능 (정적 멤버 클래스)
	
	//정적 메소드
	static void method2() {
//		B var1 = new B(); //불가능(인스턴스)
		C var2 = new C(); //가능(정적 멤버 클래스)
	}
	
	class B{} //인스턴스 멤버 클래스
	static class C{} //정적 멤버 클래스
}
