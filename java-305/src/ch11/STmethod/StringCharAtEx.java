package ch11.STmethod;

public class StringCharAtEx {

	public static void main(String[] args) {
		
		String ssn = "010624-2230123"; //�ֹι�ȣ ����
		char sex = ssn.charAt(7); //7��° ���� ����
		switch(sex) {
			case '1':
			case '3':
			case '5':
			case '7':
				System.out.println("���� �Դϴ�.");
				break;
			case '2':
			case '4':
			case '6':
			case '8':
				System.out.println("���� �Դϴ�.");
				break;
		}
	}

}
