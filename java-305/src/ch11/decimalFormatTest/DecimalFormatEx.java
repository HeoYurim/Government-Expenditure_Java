package ch11.decimalFormatTest;

import java.text.*;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		double num1 = 1234567;
		
		//�Ҽ��� ���� �ݿø� ����
		DecimalFormat df = new DecimalFormat("0");	
		System.out.println(df.format(num));
		
		//�Ҽ��� 1�ڸ� �ݿø��� ����
		df = new DecimalFormat("0.0");	
		System.out.println(df.format(num));
		
		//���ڸ��� 0���� ä���
		df = new DecimalFormat("0000000000.00000");	
		System.out.println(df.format(num));
		
		//�Ҽ��� ���� �ݿø��� ����
		df = new DecimalFormat("#");	
		System.out.println(df.format(num));
		
		//�Ҽ��� 1�ڸ� �ݿø� ����
		df = new DecimalFormat("#.#");	
		System.out.println(df.format(num));
		
		//�ڸ� ���� ����� ���� �ϴµ� ������ ����
		df = new DecimalFormat("########.#####");	
		System.out.println(df.format(num));
		
		//�����κ��� ��� ���� ��� �Ҽ� �κ��� 1�ڸ� ����(�ݿø�)
		df = new DecimalFormat("#.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//�����κ��� ��� ���� ��� �Ҽ� �κ��� 1�ڸ� ����(�ݿø�)
		df = new DecimalFormat("+#.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//�����κ��� ��� ���� ��� �Ҽ� �κ��� 1�ڸ� ����(�ݿø�)
		df = new DecimalFormat("-#.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//�����κ��� ��� ���� ��� �Ҽ� �κ��� 1�ڸ� ����(�ݿø�)
		df = new DecimalFormat("#,###.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//������� ���ϱ� 100�� �� �Ŀ� %�� ���
		df = new DecimalFormat("#,###.0 %");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		df = new DecimalFormat("\u00A4 #,###.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
	}

}
