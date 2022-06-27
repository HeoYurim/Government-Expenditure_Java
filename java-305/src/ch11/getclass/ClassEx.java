package ch11.getclass;

public class ClassEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		
		try {
			Class clazz2 = Class.forName("ch08.interfaceCar.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
