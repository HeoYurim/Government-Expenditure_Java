package ch08.interfaceVehicle;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}//�������̽����� �߻� �޼ҵ� ���� �Ҵ�

	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}//���� ��ü�� �޼ҵ� �߰�
}
