package ch07.extended.car;

public class Car { //부모 클래스
	
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	} //speedUp 메소드를 호출하면 속도가 1씩 증가
	
	public final void Stop() {
		System.out.println("자동차를 멈춥니다.");
		speed = 0;
	}

}
