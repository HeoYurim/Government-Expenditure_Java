package ch03;

public class SignOperatorEx {

	public static void main(String[] args) {

		int x = -100;		//���� 100�� x�� �ִ´�.
		int result1 = +x;	//������ +��ȣ�� �پ ��ȣ�� �����ȴ�.
		int result2 = -x;	//������ -��ȣ�� �پ ��ȣ�� ����ȴ�.
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " +result2);
		
		short s = 100;
	//	short result3 = -s; //��꿡 �⺻ Ÿ���� int�̱� ������ ������ �߻�
		int result3 = -s;
		System.out.println("result3 = " +result3);
		
	}

}
