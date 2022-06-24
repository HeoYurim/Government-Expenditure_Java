package ch08.interfaceCar;

public class Car {

	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) { //향상된 for문
			tire.roll();
		}
	}
	
	/*
	//인터페이스명 변수명 = new 한국 타이어 메소드 호출
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire BackLeftTire = new HankookTire();
	Tire BackRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
	*/
}
