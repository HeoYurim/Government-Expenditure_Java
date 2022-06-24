package ch08.interfaceEx;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		
		RemoteControl.changeBattery();
		
		/*
		RemoteControl rc = null; //인터페이스를 변수에 참조 타입으로 null 값을 넣는다.
		rc = new Television(); //텔레비전 객체를 인터페이스 연결		
		rc.turnOn(); //전원을 켭니다.
		rc.setMute(true); //인터페이스 디폴트 활용
		rc.setMute(false);
		rc.turnOff(); //전원을 끕니다.
		
		//오디오 객체를 인터페이스에 바로 연결
		RemoteControl rc1 = new Audio();		
		rc1.turnOn(); //전원을 켭니다.
		rc1.setMute(true); //인터페이스 디폴트 재정의
		rc1.setMute(false);
		rc1.turnOff(); //전원을 끕니다.
		*/
		
		/*
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		}; //인터페이스를 객체로 생성하여 익명 구현하는 객체 
		
		*/
		/*
		//인터페이스를 사용하지 않고 객체를 생성하여 사용
		Television tv = new Television();
		
		tv.turnOn();
		tv.turnOff();
		
		RemoteControl rc; //인터페이스를 변수에 넣는다.
		
		rc = new Television(); //텔레비전 객체를 인터페이스 연결
		
		rc.turnOn(); //전원을 켭니다.
		rc.turnOff(); //전원을 끕니다.
		
		rc = new Audio();
		
		rc.turnOn(); //전원을 켭니다.
		rc.turnOff(); //전원을 끕니다.
		*/
	}
}
