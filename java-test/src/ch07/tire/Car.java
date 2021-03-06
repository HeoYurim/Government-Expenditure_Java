package ch07.tire;

public class Car {
	
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽" , 5);
	Tire frontRightTire = new Tire("앞오른쪽" , 3);
	Tire backLeftTire = new Tire("뒤왼쪽" , 6);
	Tire backRightTire = new Tire("뒤오른쪽" , 2);
	
	//생성자
	
	//메소드
	int run() {
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0; //아무것도 아닐 때
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
