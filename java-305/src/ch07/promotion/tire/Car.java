package ch07.promotion.tire;

public class Car {

	//�迭�� Ȱ���Ͽ� ��ü ����
	Tire[] tires = {
			new Tire("�տ���", 10),
			new Tire("�տ�����", 8),
			new Tire("�ڿ���", 6),
			new Tire("�ڿ�����", 4)
	};
	
	//������
	//�޼ҵ� roll ��ȯ�Ͽ� ���࿩�� �Ǵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for(int i = 0; i < tires.length; i++) {			
			if(tires[i].roll() == false) {
				stop();
				return (i+1); //Ÿ�̾� ����
				//�迭�� 0~3, Ÿ�̾� �������� 1~4�� return i�� 1�� ����
			}//Ÿ�̾� ��ü�� ���ϸ����� �Ҹ�Ǿ� false�� ȣ��Ǿ����� ȣ�⿩��			
		}//�迭�� ���̱��� �ݺ��ϴ� for�� ����
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�."); //��ũ ���� ��		
	}
	
	/*
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	//�ڵ����� ��ǰ�� Ÿ�̾� 4���� ��ü�� �����Ѵ�.(��ġ, ���ϸ���)
	//������
	
	//�޼ҵ� roll ��ȯ�Ͽ� ���࿩�θ� �Ǵ�
	int run() { //�ڵ��� �޸��� ����
		
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	
	} //���� �����̸� 0�� �����ϰ� ��ũ �� 1~4���� ��ġ ������ ����
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�."); //��ũ ���� ��		
	}
	*/
}
