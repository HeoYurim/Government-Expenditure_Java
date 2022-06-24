package ch6;

class Car{
	 private String color;
	    static int numOfCar = 0;
	    static int numOfRedCar = 0;

	public Car(String color) {
		this.color = color;
        numOfCar++;

        if (color.equalsIgnoreCase("red"))
            numOfRedCar++;
	}
	
	public static int getNumOfCar() {
			return getNumOfCar();
	}
	public static int getNumOfRedCar() {
		return getNumOfRedCar();
	}
	
	public static class CarTest {
		public static void main(String[] args) {
			Car c1 = new Car("red");
			Car c2 = new Car("blue");
			Car c3 = new Car("RED");
			
			System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� �� : %d", Car.getNumOfCar(),Car.getNumOfRedCar());
		}
	
	}

	
}

