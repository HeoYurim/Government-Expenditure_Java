package ch07.promotion.vehicle;

public class DriverExam {

	public static void main(String[] args) {

		Driver driver = new Driver();
		//Driver ��ü�� ����
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//Bus, Taxi ��ü�� ����
		
		//drive() �޼ҵ带 ȣ���� �� Bus��ü�� Taxi ��ü�� ���� 
		driver.drive(bus); //�ڵ� Ÿ�� ��ȯ Vehicle vehicle = bus;
		driver.drive(taxi); //�ڵ� Ÿ�� ��ȯ Vehicle vehicle = texi;
		
	}

}
