package ch08.interfaceEx1;

public interface RemoteControl {
	
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	public abstract void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ���� �մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	public static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}
