package ch6.circle;

public class Ball extends Circle{

	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "���̴�.");
	}
	
	public void findArea() { //�������̵�
		System.out.println("���̴� 4 * (PI *r *r)�̴�. ");
	}
	
	public void findVolum() {
		System.out.println("���Ǵ� 4/3 * (PI * r * r * r)�̴�.");
	}
	
}
