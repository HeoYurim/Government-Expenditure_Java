package ch06.getter_setter;

public class CarEx {

	public static void main(String[] args) {

		Car2 myCar = new Car2();
		
//		myCar.speed = -50;
		
		//잘못된 속도를 제공
		myCar.setSpeed(-50);
		System.out.println("현재 속도는 : " + myCar.getSpeed());
		
		//값을 제공할 때는 setter
		//값을 받을 때는 getter
		
		//정상 속도 확인
		myCar.setSpeed(60);
		System.out.println("현재 속도는 : " + myCar.getSpeed());
		
		//멈춤 테스트
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 중지 상태 : " + myCar.getSpeed());
	}
}
