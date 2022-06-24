package ch6.circle;

public class Ball extends Circle{

	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	
	public void findArea() { //오버라이딩
		System.out.println("넓이는 4 * (PI *r *r)이다. ");
	}
	
	public void findVolum() {
		System.out.println("부피는 4/3 * (PI * r * r * r)이다.");
	}
	
}
