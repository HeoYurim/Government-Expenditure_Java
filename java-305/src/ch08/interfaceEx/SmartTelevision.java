package ch08.interfaceEx;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	
	@Override //Searchable 인터페이스 활용
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다.");	
	}

	@Override //RemoteControl 인터페이스 활용
	public void turnOn() {
		System.out.println("스마트 tv 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 tv 전원을 끕니다.");
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
		System.out.println("현재 스마트 TV의 볼륨 : " + this.volume);
	}

}
