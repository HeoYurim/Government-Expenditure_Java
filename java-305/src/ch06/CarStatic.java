package ch06;

public class CarStatic {
	
	static int speed; //�ʵ� ����
	static void run() {
		 System.out.println(speed + "���� �޸��ϴ�.");
	 }; //�޼ҵ� ����
	
	public static void main(String[] args) {
	//	CarStatic myCar = new CarStatic();
		
		speed = 60;
		run();
	}
}
