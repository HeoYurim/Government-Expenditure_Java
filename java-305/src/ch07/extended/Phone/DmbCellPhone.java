package ch07.extended.Phone;

public class DmbCellPhone extends CellPhone{ //�ڽ� ���̺귯�� Ŭ����
	
	//�ʵ�
	int channel; //�ڽ� �ʵ� �߰�(dmb ���� ����� �� �� �ִ� ��� �߰� ��)
	
	//������ -> �Ű����� �Է¹޾� �ʱⰪ�� ����
	DmbCellPhone(String model, String color, int channel) {

		super();//�θ� ������ ȣ��
		this.model = model; //�θ��ʵ�
		this.color = color; //�θ��ʵ�
		this.channel = channel; //�ڽ��ʵ�
	
	}
	
	//�޼ҵ� -> �ڽ� Ŭ������ �߰� �� ���
	//DMB ��۽���
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	//DMB ä�κ���
	void changeChannelDmb(int channel) {
		this.channel = channel; //ä�� ��ȣ�� �Է� �޾� ä�� ���� ����
		System.out.println("ä���� " + channel + "������ DMB ��� ������ �����մϴ�.");
	}
	
	//DMB �������
	void turnOffDmb() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
}
