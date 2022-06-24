package ch07.extended.abstract1.overrading;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	} //필드를 상속 받아 kind 값을 제공한다.
	
	@Override
	public void sound() {
		System.out.println("냥냥냥냥냥냥");		
	} //추상 메소드 강제 사용 및 오버라이딩을 진행

}
