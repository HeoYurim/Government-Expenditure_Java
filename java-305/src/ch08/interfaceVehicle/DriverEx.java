package ch08.interfaceVehicle;

public class DriverEx {

	public static void main(String[] args) {

		//�������̽� Ÿ���� bus ���� ��ü�� ����
		Vehicle vehicle = new Bus();
		
		System.out.println("�������̽� Ÿ���� run ����");
		vehicle.run();
	//	vehicle.checkFare(); -> ���� ��ü���� ������ �޼ҵ� ��� �Ұ�
		
		System.out.println();
		
		System.out.println("�ڽ� Ÿ������ ���� ��ȯ");
		//vehicle�� �ڽ� Ÿ������ ���� ��ȯ
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
		/*
		//Driver ��ü ���� / ������ driver
		Driver driver = new Driver();
		
		Bus bus = new Bus(); //���� ��ü ����
		Taxi taxi = new Taxi();
		
		//�ڵ�Ÿ�Ժ�ȯ Vehicle vc = bus;
		driver.drive(bus);
		//�ڵ�Ÿ�Ժ�ȯ Vehicle vc = taxi;
		driver.drive(taxi);
		*/
	}

}
