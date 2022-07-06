package ch07.tire;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i = 1; i < 10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("��, ���� �ѱ� Ÿ�̾�� ��ü");
				car.frontLeftTire = new hankookTire("�տ���", 12);
				break;
			case 2:
				System.out.println("��, ������ �ѱ� Ÿ�̾�� ��ü");
				car.frontRightTire = new hankookTire("�տ�����", 15);
				break;
			case 3:
				System.out.println("��, ���� �ѱ� Ÿ�̾�� ��ü");
				car.backLeftTire = new kumhoTire("�ڿ���", 17);
				break;
			case 4:
				System.out.println("��, ������ �ѱ� Ÿ�̾�� ��ü");
				car.backRightTire = new kumhoTire("�ڿ�����", 11);
				break;
			}
			
			System.out.println("--------------");
		}
		
	}

}
