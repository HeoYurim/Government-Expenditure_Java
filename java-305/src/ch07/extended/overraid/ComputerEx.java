package ch07.extended.overraid;

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10; //10값을 실수로 전달


		Calculator cal = new Calculator();
		
		System.out.println("원의 면적 : " +cal.areaCircle(r));
		System.out.println(); //부모 객체에 대한 원면적 계산값
		
		Computer com = new Computer();
		System.out.println("원의 면적 : " +com.areaCircle(r));
		System.out.println(); //자식 객체에 대한 원면적 계산값
	}

}
