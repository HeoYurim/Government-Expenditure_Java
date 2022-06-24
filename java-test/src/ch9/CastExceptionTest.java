package ch9;

class Shape{}
class Rectangle extends Shape{}
class Circle extends Shape{}

public class CastExceptionTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		try {
			casting(r);
		}catch(ClassCastException e) {
			System.out.println("타입 변환 불가");
		}
		
	}
	
	static void casting(Shape s) {
		Circle c = (Circle) s;
	}

}
