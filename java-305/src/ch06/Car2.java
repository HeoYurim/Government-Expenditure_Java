package ch06;

public class Car2 {
	
	int speed; //�ʵ�
	
	int getSpeed() { //�޼ҵ� ����
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
		System.out.println("�õ��� �ɷȽ��ϴ�.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {		
			speed = i;
			System.out.println("�޸��ϴ�. (�ü� : " + speed + "km/h)");
		}
	}
}
