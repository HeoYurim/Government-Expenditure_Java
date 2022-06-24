package ch06;

public class CarInstanceEx {

	public static void main(String[] args) {

		CarInstance myCar = new CarInstance(); //CarInstance 객체 생성(인스턴스 멤버 사용)
		myCar.gas = 10; //인스턴스 필드 사용
		myCar.setSpeed(60);	//인스턴 메소드 사용
	
		CarInstance yourCar = new CarInstance();
		yourCar.gas = 20;
		yourCar.setSpeed(100);
	}

}
