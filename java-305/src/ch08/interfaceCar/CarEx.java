package ch08.interfaceCar;

public class CarEx {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("----------------");
		System.out.println("���� Ÿ�̾� ��ȣ�� ��ü");
		System.out.println("----------------");
		
		myCar.tires[2] = new KumhoTire();
		myCar.tires[3] = new KumhoTire();
		
//		myCar.BackLeftTire = new KumhoTire();
//		myCar.BackRightTire = new KumhoTire();
		
		myCar.run();
		
	}

}
