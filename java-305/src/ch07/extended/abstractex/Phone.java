package ch07.extended.abstractex;

public abstract class Phone {//�θ� �߻� Ŭ���� (��ü ���� �ȵ�)

	//�ʵ� -> �ڷ� ����
	public String owner;
	
	//������ -> �ڷ��� �ʱⰪ
	public Phone(String owner) {
		this.owner = owner;
	}//������ ����� �� ������
	
	//�޼ҵ� -> ����
	public void turnOn() {
		System.out.println("�ڵ��� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�ڵ��� ������ ���ϴ�.");
	}
}
