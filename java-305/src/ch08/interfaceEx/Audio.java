package ch08.interfaceEx;

public class Audio implements RemoteControl{//����Ʈ�� Ȱ���ϴ� ����� ���� Ŭ����

	private int volume; //���� ���� �ʵ�
	private boolean mute;
	
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("����� ���Ұ� ó�� �Ϸ�");
		} else {
			System.out.println("����� ���Ұ� ����");
		}
	}//default �޼ҵ� ������

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ����� ���� : " + volume);
	} 

}