package ch07.extended.Phone;

public class CellPhone { //�θ� Ŭ����
	
	//�ʵ� ����
	String model;
	String color;
	
	//������(����Ʈ Ȱ��)
	
	//�޼ҵ�
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�� : " + message);}
	void receiveVoice(String message) {System.out.println("���� : " + message);}
	void hangup() {System.out.println("��ȭ�� �����ϴ�.");}

}
