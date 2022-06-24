package ch06.getter_setter;

public class Car {
	
	private int speed; //�������� �ʵ� ����
	
	public int getSpeed() { //���� ����
		return speed;
	}
	
	public void setSpeed(int speed) { //Setter ����
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
	double getSpeed() { //Getter ����
		double km = speed * 1.6;
		return km;
	} //������ km�� ȯ���ϴ� ���
	
	
	void setSpeed(int speed) { //Setter ����
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	*/

}
