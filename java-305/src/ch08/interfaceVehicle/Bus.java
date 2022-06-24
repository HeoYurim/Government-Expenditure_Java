package ch08.interfaceVehicle;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}//인터페이스에서 추상 메소드 강제 할당

	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}//구현 객체의 메소드 추가
}
