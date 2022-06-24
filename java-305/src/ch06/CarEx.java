package ch06;

public class CarEx {

	public static void main(String[] args) {

		
		
		/*
		Car myCar = new Car();	
		
		//Car 객체 생성
		
		Car myCar1 = new Car();
		System.out.println("mycar1.company : " + myCar1.company);
		System.out.println();
		
		Car myCar2 = new Car("자가용");
		System.out.println("mycar2.company : " + myCar2.company);
		System.out.println("mycar2.model : " + myCar2.model);
		System.out.println();
		
		Car myCar3 = new Car("SUV" , "빨강");
		System.out.println("mycar3.company : " + myCar3.company);
		System.out.println("mycar3.model : " + myCar3.model);
		System.out.println("mycar3.color : " + myCar3.color);
		System.out.println();
		
		Car myCar4 = new Car("SuperCar" , "검정" , 400);
		System.out.println("mycar4.company : " + myCar4.company);
		System.out.println("mycar4.model : " + myCar4.model);
		System.out.println("mycar4.color : " + myCar4.color);
		System.out.println("mycar4.maxSpeed : " + myCar4.maxSpeed);
		System.out.println();
		*/
		
		/*
		Car myCar1 = new Car();

		Car myCar2 = new Car("SUV");
		System.out.print("차량 정보: " + myCar2.model);
		System.out.print(myCar1.company + myCar2.color + myCar2.maxSpeed);
		System.out.println();
		
		Car myCar3 = new Car("SUV" , "빨강");
		System.out.print("차량 정보: " + myCar3.model);
		System.out.print(myCar1.company + myCar3.color + myCar3.maxSpeed);
		System.out.println();
		
		Car myCar4 = new Car("세단" , "파랑", 200);
		System.out.print("차량 정보: " + myCar4.model);
		System.out.print(myCar1.company + myCar4.color + myCar4.maxSpeed);
		System.out.println();
		*/
		
		Car myCar = new Car();
		
		myCar.setGas(5); //gas양을 5로 충전
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) { //isLeftGas메소드를 이용하여 0이면 false
			System.out.println("출발합니다.");
			myCar.run(); //가스를 소모하며 주행하는 메소드 호출
		}
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
