package ch06;

public class Car2Ex {

	public static void main(String[] args) {

		Car2 myCar = new Car2();
		
		myCar.keyTurnOn();
		myCar.run();
		System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");
		//int speed = myCar.getSpeed();
		//System.out.println("현재 속도 : " + speed + "km/h");
	}

}
