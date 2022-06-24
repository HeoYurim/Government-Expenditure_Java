package ch08.interfaceDefaultExtends;

public interface ChildInterface2 extends ParentInterface{
		
	//부모 인터페이스의 메소드2를 재정의 하여 제공
	@Override
	default void method2() {
		System.out.println("부모 인터페이스의 메소드2를 재정의 실행");
	}
	
	//자식에서 제공하는 추상메소드
	public void method3();

}
