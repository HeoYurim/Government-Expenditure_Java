package ch07.extended.abstract1.overrading;

public abstract class Animal { //팀장이 선언한 추상 클래스
	
	public String kind; //동물의 종류를 받는 필드
	
	//생성자 기본 생성자를 활용(생략)
	
	public void breathe() { //일반 메소드
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드
	//자식 클래스에서 무조건 활용해야 하는 메소드
	//중괄호 블럭이 없이 작성되며, 자식에서 재정의 되어 활용된다.
}
