package ch08.interfaceDefault;

public interface MyInterface {
	
	//추상 메소드로 무조건 사용해야 함.
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface에 Default 메소드 실행");
	}
	
}
