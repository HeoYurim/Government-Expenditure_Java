package ch07.promotion.tire;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i = 1; i <= 15; i++) { //자동차 마일리지 소모
			
			int problemLocation = car.run();
			if(problemLocation != 0) { //15번 반복
				System.out.println(car.tires[problemLocation - 1].location + "한국 타이어로 교체"); //-1은 인덱스는 0번부터 타이어는 1부터라서 함
				car.tires[problemLocation - 1] = new hankookTire(car.tires[problemLocation -1].location, 15);
			}
			System.out.println("---------------------");
		}
		
		/*
		for(int i = 1; i <= 10; i++) { //자동차 마일리지 소모
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞,왼쪽 한국 타이어로 교체");
				car.frontLeftTire = new hankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞,오른쪽 한국 타이어로 교체");
				car.frontRightTire = new hankookTire("앞오른쪽", 20);
				break;
			case 3:
				System.out.println("뒤,왼쪽 금호 타이어로 교체");
				car.backLeftTire = new kumhoTire("뒤왼쪽", 12);
				break;
			case 4:
				System.out.println("뒤, 오른쪽 금호 타이어로 교체");
				car.backRightTire = new kumhoTire("뒤오른쪽", 17);
				break;
			}//마일리지 소모 후 자동 교체되는 코드
			
			System.out.println("---------------------");
			
		}//1회전 종료에 대한 구분선
		*/
	}

}
