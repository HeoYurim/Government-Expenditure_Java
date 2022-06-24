package ch08.interfaceEx;

public interface RemoteControl { //리모컨을 예로 인터페이스 실습

	//상수
	public int MAX_VOLUME = 10; //최대 볼륨 10 -> public static final도 똑같음
	public int MIN_VOLUME = 0;  //최소 볼륨 0
	
	//추상 메소드
	public abstract void turnOn(); //전원 켬/끔
	public void turnOff(); //abstract 생략 가능
	void setVolume(int volume); //볼륨 조절(setter 활용)
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}// 무음 처리 메소드 종료
	
	//정적 메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
