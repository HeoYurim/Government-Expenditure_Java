package ch07.extended.car;

public class Car { //�θ� Ŭ����
	
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() {
		speed += 1;
	} //speedUp �޼ҵ带 ȣ���ϸ� �ӵ��� 1�� ����
	
	public final void Stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		speed = 0;
	}

}
