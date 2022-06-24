package ch08.interfaceDefault;

public class DefaultMethodEx {

	public static void main(String[] args) {

		//MyInterface 인터페이스를 MyClassA() 구현 클래스를 이용하여 객체 생성
		MyInterface mi1 = new MyClassA();
		
		mi1.method1(); //재정의된 메소드 호출
		mi1.method2(); //인터페이스에서 제공하는 메소드 호출
		
		//MyInterface 인터페이스를 MyClassB() 구현 클래스를 이용하여 객체 생성
		MyInterface mi2 = new MyClassB();
		
		mi2.method1(); //재정의된 메소드 호출
		mi2.method2(); //인터페이스에서 제공하는 메소드 호출
		
	} //결론 디폴트로 생성한 메소드는 유연한 모습을 볼 수 있다.
}
