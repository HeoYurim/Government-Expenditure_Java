package ch07.extended.abstractex;

public abstract class Phone {//부모 추상 클래스 (객체 생성 안됨)

	//필드 -> 자료 저장
	public String owner;
	
	//생성자 -> 자료의 초기값
	public Phone(String owner) {
		this.owner = owner;
	}//팀장이 만들어 준 생성자
	
	//메소드 -> 동작
	public void turnOn() {
		System.out.println("핸드폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("핸드폰 전원을 끕니다.");
	}
}
