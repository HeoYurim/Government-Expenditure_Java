package ch03;

public class PrintDemoEx {

	public static void main(String[] args) {

		int i = 97;
		String s = "Java";
		double f = 3.14f;
		
		System.out.printf("%d\n" , i);		// 97�� ��
		System.out.printf("%o\n" , i);		// 8���� ��
		System.out.printf("%x\n" , i);		// 16���� ��
		System.out.printf("%c\n" , i);		// char ��
		System.out.printf("%5d\n" , i);		// 5ĭ ä����ε� ���ڰ� �ڿ� �������� �տ��� �� �������� ����
		System.out.printf("%05d\n" , i);	// �� ������ 0���� ä��
		System.out.printf("%s\n" , s);		// String ��
		System.out.printf("%5s\n" , s);		// 5ĭ�� string �� ä��, ���� ���� ��ĭ
		System.out.printf("%-5s\n" , s);	// -�� ���ʺ��� ����, �ǵڿ� ��ĭ
		System.out.printf("%f\n" , f);		// double ��(10���� �Ǽ�)
		System.out.printf("%e\n" , f);		// ����
		System.out.printf("%4.1f\n" , f);	// 4�ڸ�, �Ҽ��� ���� 1�ڸ�, �տ� ���� �� ��ĭ
		System.out.printf("%04.1f\n" , f);	// 4�ڸ�, �Ҽ��� ���� 1�ڸ�, ��ĭ 0
		System.out.printf("%-4.1f\n" , f);	// 4�ڸ�, �Ҽ��� ���� 1�ڸ�, ���� ����
		
	}

}
