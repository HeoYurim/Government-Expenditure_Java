package ch03;

public class CompareOperatorEx2 {

	public static void main(String[] args) {

		int v2 = 1;		    //���� -> double
		double v3 = 1.0;	//�Ǽ�
		System.out.println(v2 == v3);	//1�� 1.0�� ������ �� ���
		//�񱳿����ڵ� ������ �����ϱ� ���� Ÿ�Ժ�ȯ�� ���� ū Ÿ������ ��ġ ��Ų��.
		
		System.out.println("--------------");
		
		double v4 = 0.1;
		float v5 = 0.1F;	//������ ������ ����ϴ� �ε��Ҽ��� �������� �ٻ簪�� ǥ��
		
		System.out.println(v4 == v5);	//false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4 * 10) == (int)(v5 * 10)); //true
		
		
	}

}
