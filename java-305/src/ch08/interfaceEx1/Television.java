package ch08.interfaceEx1;

public class Television implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("tv�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� tv ���� : " + this.volume);
	}	
}
