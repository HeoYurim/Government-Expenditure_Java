package ch08.interfaceEx;

public interface RemoteControl { //�������� ���� �������̽� �ǽ�

	//���
	public int MAX_VOLUME = 10; //�ִ� ���� 10 -> public static final�� �Ȱ���
	public int MIN_VOLUME = 0;  //�ּ� ���� 0
	
	//�߻� �޼ҵ�
	public abstract void turnOn(); //���� ��/��
	public void turnOff(); //abstract ���� ����
	void setVolume(int volume); //���� ����(setter Ȱ��)
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ���� �մϴ�.");
		}
	}// ���� ó�� �޼ҵ� ����
	
	//���� �޼ҵ�
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}
