package ch06;

public class CarThis {
	
	String model; //�ʵ� ����
	int speed; //�ʵ� ����
	
	CarThis(String model){ //������ ����(�̸��� �Ȱ����� ������)
		this.model = model; //this�� ���ϸ� ���� model���� ���Ƽ� this�� �Ἥ ���� �ʵ带 �����´�.
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 0; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.");
			System.out.println("�ü� : " + this.speed + "km/h");
		}
	}
}
