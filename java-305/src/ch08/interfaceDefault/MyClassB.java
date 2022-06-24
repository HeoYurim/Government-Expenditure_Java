package ch08.interfaceDefault;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyInterface에 추상메소드1 재정의 실행");		
	}

	@Override
	public void method2() {
		System.out.println("MyInterface에 디폴트메소드2 재정의 실행");	
	}
	
}
