package ch07.casting;

public class Child extends Parent{

	String field2; //부모 클래스의 필드만 사용 가능
	
	//오버라이딩 전에 사용 안됨, 부모 클래스의 메소드만 사용
	void method2() { }; 
	void method3() { };
	
}
