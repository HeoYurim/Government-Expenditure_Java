package ch07.extended.abstract1.overrading;

public class Dog extends Animal{

	public Dog() {
		this.kind = "포유류";
	} //필드를 상속 받아 kind 값을 제공한다.
	
	@Override
	public void sound() {
		System.out.println("멍멍멍멍멍멍멍멍왈왈왈왈");		
	} //추상 메소드 강제 사용 및 오버라이딩을 진행

}
