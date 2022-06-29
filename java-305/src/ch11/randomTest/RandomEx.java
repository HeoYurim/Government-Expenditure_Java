package ch11.randomTest;

import java.text.*;
import java.util.*;

public class RandomEx {
	
	public static void main(String[] args) {
		//���� ��ȣ
		//���ù�ȣ 6���� ����� �迭 ����
		int[] selectNumber = new int[6];
		
		Random random = new Random(4);
		
		System.out.print("���ù�ȣ : ");
		
		for(int i = 0; i < 6; i++) {
			//���� ��ȣ�� �� �迭�� ����
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//��÷��ȣ ����
		int[] winningNumber = new int[6];
		random = new Random(6);
		System.out.print("��÷��ȣ : ");
		
		for(int i = 0; i < 6; i++) {
			//���� ��ȣ�� �� �迭�� ����
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//��÷���� �м�
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber); //�迭 �� ���� �������� ����
		
		//�迭 �׸� �񱳷� true/false�� ���´�.
		boolean result =  Arrays.equals(selectNumber, winningNumber);
		
		if(result) {
			System.out.println("1� ��÷ �Ǽ̽��ϴ�.");
		}else {
			System.out.println("������ ��÷ �ǽǰ̴ϴ�.");
		}
		
		Date now = new Date();
		String str1Now1 = now.toString();
		System.out.println(now);
		System.out.println(str1Now1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
