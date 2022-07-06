package ch07.tire;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i = 1; i < 10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞, 왼쪽 한국 타이어로 교체");
				car.frontLeftTire = new hankookTire("앞왼쪽", 12);
				break;
			case 2:
				System.out.println("앞, 오른쪽 한국 타이어로 교체");
				car.frontRightTire = new hankookTire("앞오른쪽", 15);
				break;
			case 3:
				System.out.println("뒤, 왼쪽 한국 타이어로 교체");
				car.backLeftTire = new kumhoTire("뒤왼쪽", 17);
				break;
			case 4:
				System.out.println("뒤, 오른쪽 한국 타이어로 교체");
				car.backRightTire = new kumhoTire("뒤오른쪽", 11);
				break;
			}
			
			System.out.println("--------------");
		}
		
	}

}
