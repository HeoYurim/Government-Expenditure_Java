package ch03;

public class LogicalOperatorEx {

	public static void main(String[] args) {

		int charCode = '7';
		
		if((charCode >= 65) & (charCode <= 90)) {	//�����ڵ� ǥ�� 65~90 ���� ���� �빮��.
			System.out.println("�빮���Դϴ�. �� " + charCode);
		}
		
		if((charCode >= 97) && (charCode <= 122)) {	//�����ڵ� ǥ�� 97~122���� ���� �ҹ���
			System.out.println("�ҹ����Դϴ�. �� " + charCode);
		}
		
		//�����ڵ� ǥ�� ���ڴ� 47~57�� �ִ�.
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9������ �����Դϴ�. �� " + charCode);
		}
		
		int value = 8;
		
		if((value % 2 == 0 | (value % 3 == 0))) {
			System.out.println("2 �Ǵ� 3�� ��� �Դϴ�. �� " + value);
		}
		
		if((value % 2 == 0 && (value % 3 == 0))) {
			System.out.println("2�� ����̰� 3�� ��� �Դϴ�. �� " + value);
		}
		
	}

}
