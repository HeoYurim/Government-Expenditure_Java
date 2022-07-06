package ch08;

class Circle{
	private int i;
	
	public Circle(int i) {
		this.i = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Circle) {
			Circle num = (Circle) obj;
			
			if(i == num.i) { //int�� equals ����
				return true;
			}
		}
		return false;
	}
	
}
public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		
		if(c1.equals(c2)) {
			System.out.println("c1�� c2�� ����.");
		}else {
			System.out.println("c1�� c2�� �ٸ���.");
		}
	}

}
