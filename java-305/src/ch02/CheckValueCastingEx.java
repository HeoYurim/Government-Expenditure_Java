package ch02;

public class CheckValueCastingEx {

	public static void main(String[] args) {

		long i = 128000000000000000L;
		
		if(i < (Double.MIN_VALUE) || (i > (Double.MAX_VALUE))) {
			//i�� ���� byte�� �ּڰ����� �۰ų� �ִ񰪺��� ũ��
			System.out.println("DoubleŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println(Double.MIN_VALUE + "������ �۰ų�");
			System.out.println(Double.MAX_VALUE + "������ Ů�ϴ�.");
		} 
		else {
			double b = (double)i; //int�� byte�� ����Ÿ�Ժ�ȯ
			System.out.println(b);
			System.out.println(Double.MIN_VALUE + "������ �۰ų�");
			System.out.println(Double.MAX_VALUE + "������ Ů�ϴ�.");
		}
		
	}

}
