package ch06;

public class CarInstanceEx {

	public static void main(String[] args) {

		CarInstance myCar = new CarInstance(); //CarInstance ��ü ����(�ν��Ͻ� ��� ���)
		myCar.gas = 10; //�ν��Ͻ� �ʵ� ���
		myCar.setSpeed(60);	//�ν��� �޼ҵ� ���
	
		CarInstance yourCar = new CarInstance();
		yourCar.gas = 20;
		yourCar.setSpeed(100);
	}

}
