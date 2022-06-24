package ch03;

public class CheckOverFlowEx {

	public static void main(String[] args) {

		try { //���ܸ� ó���ϴ� ��
			int result = safeAdd(200000, 200000); //���� ���� �� ����
			System.out.println(result); //���� ���� �� ���
		}
		catch(ArithmeticException e){ //���� �� ������ ���� ó����
			System.out.println("�����÷ο� �߻� : ����� �� ����.");
		}
	}

	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("���� �÷ο� �߻�");
			}
		}
		else {
				if(left < (Integer.MIN_VALUE - right)) {
					throw new ArithmeticException("���� �÷ο� �߻�");
				}
			}
			return left + right;
		}
}