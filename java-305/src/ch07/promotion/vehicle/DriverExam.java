package ch07.promotion.vehicle;

public class DriverExam {

	public static void main(String[] args) {

		Driver driver = new Driver();
		//Driver 객체를 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//Bus, Taxi 객체를 생성
		
		//drive() 메소드를 호출할 때 Bus객체와 Taxi 객체를 제공 
		driver.drive(bus); //자동 타입 변환 Vehicle vehicle = bus;
		driver.drive(taxi); //자동 타입 변환 Vehicle vehicle = texi;
		
	}

}
