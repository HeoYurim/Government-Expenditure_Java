package ch06.getter_setter;

public class Car {
	
	private int speed; //개인적인 필드 선언
	
	public int getSpeed() { //게터 설정
		return speed;
	}
	
	public void setSpeed(int speed) { //Setter 설정
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	private boolean stop;
	
	//Getter
	public boolean isStop() {
		return stop;
	}
	
	//Setter
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	/*
	double getSpeed() { //Getter 설정
		double km = speed * 1.6;
		return km;
	} //마일을 km로 환산하는 결과
	
	
	void setSpeed(int speed) { //Setter 설정
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	*/

}
