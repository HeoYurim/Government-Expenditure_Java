package ch07.promotion.tire;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i = 1; i <= 15; i++) { //�ڵ��� ���ϸ��� �Ҹ�
			
			int problemLocation = car.run();
			if(problemLocation != 0) { //15�� �ݺ�
				System.out.println(car.tires[problemLocation - 1].location + "�ѱ� Ÿ�̾�� ��ü"); //-1�� �ε����� 0������ Ÿ�̾�� 1���Ͷ� ��
				car.tires[problemLocation - 1] = new hankookTire(car.tires[problemLocation -1].location, 15);
			}
			System.out.println("---------------------");
		}
		
		/*
		for(int i = 1; i <= 10; i++) { //�ڵ��� ���ϸ��� �Ҹ�
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("��,���� �ѱ� Ÿ�̾�� ��ü");
				car.frontLeftTire = new hankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("��,������ �ѱ� Ÿ�̾�� ��ü");
				car.frontRightTire = new hankookTire("�տ�����", 20);
				break;
			case 3:
				System.out.println("��,���� ��ȣ Ÿ�̾�� ��ü");
				car.backLeftTire = new kumhoTire("�ڿ���", 12);
				break;
			case 4:
				System.out.println("��, ������ ��ȣ Ÿ�̾�� ��ü");
				car.backRightTire = new kumhoTire("�ڿ�����", 17);
				break;
			}//���ϸ��� �Ҹ� �� �ڵ� ��ü�Ǵ� �ڵ�
			
			System.out.println("---------------------");
			
		}//1ȸ�� ���ῡ ���� ���м�
		*/
	}

}
