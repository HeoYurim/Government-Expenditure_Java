package ch06;

public class CarThis {
	
	String model; //필드 선언
	int speed; //필드 선언
	
	CarThis(String model){ //생성자 선언(이름이 똑같으면 생성자)
		this.model = model; //this를 안하면 갈색 model끼리 돌아서 this를 써서 위에 필드를 가져온다.
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 0; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.");
			System.out.println("시속 : " + this.speed + "km/h");
		}
	}
}
