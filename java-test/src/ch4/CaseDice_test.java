package ch4;

public class CaseDice_test {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 6) + 1;
		
		System.out.println("�ֻ��� ���� -> " + num);
		
		switch(num) {
		case '1':
			System.out.println("1���̶��");
		case '2':
			System.out.println("2���̶��");
		case '3':
			System.out.println("3���̶��");
		case '4':
			System.out.println("4���̶��");
		case '5':
			System.out.println("5���̶��");
		case '6':
			System.out.println("6���̶��");

		}
		
	}

}
