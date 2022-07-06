package ch06.circle;

public class InheritanceDemo {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색");
		
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea(); //상속에 의해 잘못 나옴
		c2.findVolum();
	}

}
