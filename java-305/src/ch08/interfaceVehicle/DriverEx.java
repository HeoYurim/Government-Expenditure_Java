package ch08.interfaceVehicle;

public class DriverEx {

	public static void main(String[] args) {

		//인터페이스 타입을 bus 구현 객체로 생성
		Vehicle vehicle = new Bus();
		
		System.out.println("인터페이스 타입의 run 실행");
		vehicle.run();
	//	vehicle.checkFare(); -> 구현 객체에서 생성한 메소드 사용 불가
		
		System.out.println();
		
		System.out.println("자식 타입으로 강제 변환");
		//vehicle을 자식 타입으로 강제 변환
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
		/*
		//Driver 객체 생성 / 변수명 driver
		Driver driver = new Driver();
		
		Bus bus = new Bus(); //구현 객체 생성
		Taxi taxi = new Taxi();
		
		//자동타입변환 Vehicle vc = bus;
		driver.drive(bus);
		//자동타입변환 Vehicle vc = taxi;
		driver.drive(taxi);
		*/
	}

}
