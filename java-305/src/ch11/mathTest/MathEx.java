package ch11.mathTest;

public class MathEx {

	public static void main(String[] args) {
		int v1 = Math.abs(-5); //���밪 (����->���)
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		double v3 = Math.ceil(5.3); //�ø�(�Ҽ��� �ø�)
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		double v5 = Math.floor(5.3); //����(�Ҽ��� ����)
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		int v7 = Math.max(5, 9); //�ִ밪
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);
		
		int v9 = Math.min(5, 9); //�ּҰ�
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		double v11 = Math.random(); //���� ��(0.0 ~ 1.0���� ����)
		System.out.println("v11 = " + v11);
		
		double v12 = Math.rint(5.3); //����� ������ �Ǽ���
		double v13 = Math.rint(5.7);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		long v14 = Math.round(5.3); //�ݿø� ����
		long v15 = Math.round(5.7);
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		double value = 12.3456; //�ݿø� ����ǥ�� (�Ǽ��� �ݿø�)
		double temp1 = value * 100; //���ϱ� 100�� �ؼ� �ݿø� 1234.56
		long temp2 = Math.round(temp1); //�ݿø� 1235
		double v16 = temp2 / 100.0; //������ 100�� �ؼ� �Ǽ� 12.35
		System.out.println("v16 = " + v16);
	}

}
