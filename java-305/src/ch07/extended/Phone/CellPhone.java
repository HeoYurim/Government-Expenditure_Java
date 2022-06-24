package ch07.extended.Phone;

public class CellPhone { //부모 클래스
	
	//필드 생성
	String model;
	String color;
	
	//생성자(디폴트 활용)
	
	//메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("나 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	void hangup() {System.out.println("전화를 끊습니다.");}

}
