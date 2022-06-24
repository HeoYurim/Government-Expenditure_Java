package ch06;

public class CarStatic {
	
	static int speed; //필드 생성
	static void run() {
		 System.out.println(speed + "으로 달립니다.");
	 }; //메소드 생성
	
	public static void main(String[] args) {
	//	CarStatic myCar = new CarStatic();
		
		speed = 60;
		run();
	}
}
