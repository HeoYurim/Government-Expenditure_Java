package ch04;

public class SwitchCharEx {

	public static void main(String[] args) {

		char grade = 'G';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ�� �Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ�� �Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
			System.out.println("ȸ�������� �Ͻðڽ��ϱ�?");
		}
	}

}
