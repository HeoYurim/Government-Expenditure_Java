package ch07.extended.overraid;

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10; //10���� �Ǽ��� ����


		Calculator cal = new Calculator();
		
		System.out.println("���� ���� : " +cal.areaCircle(r));
		System.out.println(); //�θ� ��ü�� ���� ������ ��갪
		
		Computer com = new Computer();
		System.out.println("���� ���� : " +com.areaCircle(r));
		System.out.println(); //�ڽ� ��ü�� ���� ������ ��갪
	}

}
