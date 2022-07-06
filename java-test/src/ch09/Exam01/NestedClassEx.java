package ch09.Exam01;

public class NestedClassEx {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		Car.Tire tire = mycar.new Tire();
		Car.Engine engine = new Car.Engine();
		
	}

}
