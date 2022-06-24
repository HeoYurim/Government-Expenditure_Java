package ch06;

public class Car2 {
	
	int speed; //필드
	
	int getSpeed() { //메소드 생성
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
		System.out.println("시동이 걸렸습니다.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {		
			speed = i;
			System.out.println("달립니다. (시속 : " + speed + "km/h)");
		}
	}
}
