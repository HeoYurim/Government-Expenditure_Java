package ch06;

public class Car2Ex {

	public static void main(String[] args) {

		Car2 myCar = new Car2();
		
		myCar.keyTurnOn();
		myCar.run();
		System.out.println("���� �ӵ� : " + myCar.getSpeed() + "km/h");
		//int speed = myCar.getSpeed();
		//System.out.println("���� �ӵ� : " + speed + "km/h");
	}

}
