package ch06;

public class Car { // Car Ŭ������ �������� �����Ѵ�.

	//�ʵ� (��ü�� �����Ͱ� ����Ǵ� ��)
	
	
	//-----���� ������-------
	String company = "����"; //����ȸ��
	String model; //��
	String color; //����
	int maxSpeed; //�ְ�ӵ�
	int speed; //����ӵ�
	
	//������ (��ü ������ �ʱ�ȭ ������ ���)
	Car(){ //������ �����ڴ� �����ε��� �ڵ����� �������� �ʴ´�.
		
	}
	Car(String model){
		this(model,"����",250);
	}
	Car(String model,String color){
		this(model,color,250);

	}
	Car(String model,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	int gas; //�ʵ�
	
	//������ ����
	
	//�޼ҵ� ����
	void setGas(int gas) {
		this.gas = gas;
	} //���� ���� ���� �޼ҵ�� �Ű� ���� �޾Ƽ� gas �ʵ� �� ����
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	} //gas�� �� ������ �Ǵ��Ͽ� ����
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸���. gas �ܷ� : (" + gas +  ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�. gas �ܷ� : (" + gas +  ")");
				return;
			}
		}
	}
	
	/*
	Car(){ //�⺻ ������
		
	}
	Car(String model){ //�𵨰��� �޴� ������
		this.model = model;
	}
	Car(String model, String color){ //�𵨰� ���������� ���� ������
		this.model = model;
		this.color = color;
	}
	Car( int speed,  int maxSpeed){ //�𵨰� ���������� ���� ������
		this.speed = speed;
		this.maxSpeed = maxSpeed;
	}
	Car(String color, int maxSpeed){ //�𵨰� ���������� ���� ������
		this.model = model;
		this.color = color;
	};
	Car(String model, String color, int maxSpeed){ //�𵨰� ��������, �Ӽ� ������ �޴� ������
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	};
	*/
}