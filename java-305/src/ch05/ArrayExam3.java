package ch05;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {

		int student = 0;
		int sum = 0;
		float average = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л� ���� �Է��ϼ��� : ");
		student = scan.nextInt();
		int scores[] = new int[student];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			scores[i] = scan.nextInt();
		}
		
		for(int j = 0; j < scores.length-1; j++) { //0~6���� �ݺ��ϴ� ��(�� 6����Ŭ)
			for(int k = 0; k < scores.length-1-j; k++) { //0~6���� �ݺ��� / 0~5���� / 0~4����
				if(scores[k] < scores[k+1]) { //0���� 1���� ���ؼ� ������ �ڸ��ٲ� / 1���� 2�� �� / 3���� 4�� �� /... 
					int tmp = scores[k]; //0���� ������ tmp�� ���� ����
					scores[k] = scores[k+1]; //0���� ū ���� ����
					scores[k+1] = tmp; // 1���� ���� ���� ����
 				}
			}
		}
		System.out.println();
		for(int i = 0; i < scores.length; i++) {	//�迭 �� ���
			System.out.print(scores[i] + " ");
		}

		// ���� ���ϴ� ����
		for (int i = 0; i < scores.length; i++) {
			sum = sum += scores[i];
		}
		// ��� ���ϴ� ����
		average = (float) sum / scores.length;

		System.out.println();

		// ���� ��¹�
		System.out.println("���� : " + sum);
		// ��� ��¹�
		System.out.println("��� : " + average);

		int max = scores[0]; // �ִ밪 ���ϴ� ������ 0�� �ε��� ���� ����
		int min = scores[0]; // �ּҰ� ���ϴ� ������ 0�� �ε��� ���� ����

		// �ִ밪�� �ּҰ��� ���ϴ� for��
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			} else if (min > scores[i]) {
				min = scores[i];
			}
		}

		// �ִ밪 ��¹�
		System.out.println("�ִ밪 : " + max);

		// �ּҰ� ��¹�
		System.out.println("�ּҰ� : " + min);
	}

}
