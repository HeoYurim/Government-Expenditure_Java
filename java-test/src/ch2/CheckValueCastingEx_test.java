package ch2;

public class CheckValueCastingEx_test {

	public static void main(String[] args) {

		long i = 12800000000000000L;
		
		//i���� double�� �ּڰ����� �۰ų� �ִ񰪺��� ũ�� double Ÿ�� ��ȯ�� �� ���ٴ� �޼���
		if(i < (Double.MIN_VALUE) || (i > (Double.MAX_VALUE))) {
			System.out.println("Double Ÿ������ ��ȯ�� �� ����.");
			System.out.println(Double.MIN_VALUE + "������ �۽��ϴ�.");
			System.out.println(Double.MAX_VALUE + "������ Ů�ϴ�.");
		}
		//�װ� �ƴ� ���� i�� double A ������ �ٲ� �� A�� ���, �ּڰ����� �۰ų� �ִ񰪺��� ũ�ٴ� �޼��� ���
		else {
			double A = (double)i;
			System.out.println(A);
			System.out.println(Double.MIN_VALUE + "������ �۰ų�");
			System.out.println(Double.MAX_VALUE + "������ Ů�ϴ�.");
		}
	}

}
