package ch08.interfaceEx;

public class Audio implements RemoteControl{//리모트를 활용하는 오디오 구현 클래스

	private int volume; //볼륨 조절 필드
	private boolean mute;
	
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 음소거 처리 완료");
		} else {
			System.out.println("오디오 음소거 해제");
		}
	}//default 메소드 재정의

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
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
		System.out.println("현재 오디오 볼륨 : " + volume);
	} 

}
