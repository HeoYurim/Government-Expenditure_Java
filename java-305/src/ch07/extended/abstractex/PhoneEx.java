package ch07.extended.abstractex;

public class PhoneEx {

	public static void main(String[] args) {
		
		//Phone이라는 객체는 추상 클래스의 부모임으로 객체 생성 안됨
		//Phone ph = new Phone();
		
		SmartPhone sp = new SmartPhone("허유림");
		
		sp.turnOn(); //부모의 전원을 켭니다라는 메소드 호출
		sp.internetSerarch(); //자식의 인터넷 검색 합니다. 메소드 호출
		sp.turnOff(); //부모의 전원을 끕니다 라는 메소드 호출
		
	}

}
