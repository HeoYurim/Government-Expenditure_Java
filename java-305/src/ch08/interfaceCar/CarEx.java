package ch08.interfaceCar;

public class CarEx {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("----------------");
		System.out.println("뒤쪽 타이어 금호로 교체");
		System.out.println("----------------");
		
		myCar.tires[2] = new KumhoTire();
		myCar.tires[3] = new KumhoTire();
		
//		myCar.BackLeftTire = new KumhoTire();
//		myCar.BackRightTire = new KumhoTire();
		
		myCar.run();
		
	}

}
