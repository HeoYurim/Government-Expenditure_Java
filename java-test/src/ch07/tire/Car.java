package ch07.tire;

public class Car {
	
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���" , 5);
	Tire frontRightTire = new Tire("�տ�����" , 3);
	Tire backLeftTire = new Tire("�ڿ���" , 6);
	Tire backRightTire = new Tire("�ڿ�����" , 2);
	
	//������
	
	//�޼ҵ�
	int run() {
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0; //�ƹ��͵� �ƴ� ��
	}

	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
