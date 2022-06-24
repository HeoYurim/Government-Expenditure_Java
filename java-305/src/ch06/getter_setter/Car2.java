package ch06.getter_setter;

public class Car2 {
	
	//개인적인 필드
	private int speed; //선언은 private 사용
	private boolean stop;
	
	
	//공용 메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
		
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	} //stop값이 true이면 스톱을 진행하고 스피드는 0으로 조절
	
}
