package ch06;

public class CarEx {

	public static void main(String[] args) {

		
		
		/*
		Car myCar = new Car();	
		
		//Car ��ü ����
		
		Car myCar1 = new Car();
		System.out.println("mycar1.company : " + myCar1.company);
		System.out.println();
		
		Car myCar2 = new Car("�ڰ���");
		System.out.println("mycar2.company : " + myCar2.company);
		System.out.println("mycar2.model : " + myCar2.model);
		System.out.println();
		
		Car myCar3 = new Car("SUV" , "����");
		System.out.println("mycar3.company : " + myCar3.company);
		System.out.println("mycar3.model : " + myCar3.model);
		System.out.println("mycar3.color : " + myCar3.color);
		System.out.println();
		
		Car myCar4 = new Car("SuperCar" , "����" , 400);
		System.out.println("mycar4.company : " + myCar4.company);
		System.out.println("mycar4.model : " + myCar4.model);
		System.out.println("mycar4.color : " + myCar4.color);
		System.out.println("mycar4.maxSpeed : " + myCar4.maxSpeed);
		System.out.println();
		*/
		
		/*
		Car myCar1 = new Car();

		Car myCar2 = new Car("SUV");
		System.out.print("���� ����: " + myCar2.model);
		System.out.print(myCar1.company + myCar2.color + myCar2.maxSpeed);
		System.out.println();
		
		Car myCar3 = new Car("SUV" , "����");
		System.out.print("���� ����: " + myCar3.model);
		System.out.print(myCar1.company + myCar3.color + myCar3.maxSpeed);
		System.out.println();
		
		Car myCar4 = new Car("����" , "�Ķ�", 200);
		System.out.print("���� ����: " + myCar4.model);
		System.out.print(myCar1.company + myCar4.color + myCar4.maxSpeed);
		System.out.println();
		*/
		
		Car myCar = new Car();
		
		myCar.setGas(5); //gas���� 5�� ����
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) { //isLeftGas�޼ҵ带 �̿��Ͽ� 0�̸� false
			System.out.println("����մϴ�.");
			myCar.run(); //������ �Ҹ��ϸ� �����ϴ� �޼ҵ� ȣ��
		}
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
