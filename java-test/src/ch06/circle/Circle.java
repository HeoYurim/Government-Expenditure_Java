package ch06.circle;

public class Circle {

	private void secret() { //private�� Ŭ���� ���ο����� ���� ����
		System.out.println("����̴�.");
	}
	
	protected void findRadius() {
		System.out.println("�������� 10.0��Ƽ�̴�.");
	}
	
	public void findArea() {
		System.out.println("���̴� (PI *r *r)�̴�. ");
	}
	
}
