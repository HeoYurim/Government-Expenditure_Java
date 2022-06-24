package ch08.interfaceDefaultExtends;

public interface ChildInterface3 extends ParentInterface{
		
	//부모 인터페이스의 메소드2를 재정의 하여 제공
	@Override
	public void method2();
	
	//자식에서 제공하는 추상메소드
	public void method3();

}
