package ch08.interfaceEx1;

import ch08.interfaceEx.RemoteControl;

public class SmartTelevision implements RemoteControl{

	private int volume;
	
	public void search(String url) {
		System.out.println(url + "��(��) �˻��մϴ�.");	
	}

	@Override //RemoteControl �������̽� Ȱ��
	public void turnOn() {
		System.out.println("����Ʈ tv ������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ tv ������ ���ϴ�.");
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
		System.out.println("���� ����Ʈ TV�� ���� : " + this.volume);
	}
}
