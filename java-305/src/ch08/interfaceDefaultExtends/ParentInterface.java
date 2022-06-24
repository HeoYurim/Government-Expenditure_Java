package ch08.interfaceDefaultExtends;

public interface ParentInterface {

	//부모 인터페이스
	
	//추상 메소드라 실행문이 없다.
	public void method1();
	
	//디폴트 메소드라 실행문이 있다.
	public default void method2() {
		System.out.println("부모 인터페이스의 메소드2를 실행");
	}
}
