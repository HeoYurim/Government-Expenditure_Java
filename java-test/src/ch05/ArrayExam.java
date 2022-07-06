package ch05;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//�� ���� �� �Է�
		System.out.print("�� ���� ���� �Է��ϼ��� : ");
		int people = scan.nextInt();
		int scores[] = new int[people];
		
		//�� ���� �ο� �� �Է�
		for(int i = 0; i< scores.length; i++) {
			System.out.print("���� �ο� ���� �Է��ϼ��� -> ");
			scores[i] = scan.nextInt();
		}
		
		//���� ���� ������ ����
		for(int j = 0; j < scores.length-1; j++) { //�ο��� ��ŭ ����
			for(int z = 0; z<scores.length-1-j; z++) {
				if(scores[z] < scores[z+1]) {//������ �� ������ ���� ������ �ڸ� �ٲ�
					int tmp = scores[z];
					scores[z] = scores[z+1];
					scores[z+1] = tmp;
				}
			}
		}
		System.out.println();
		
		//�� �л� ��
		for(int i = 0; i <scores.length; i++) {
			sum = sum += scores[i];
		}
		System.out.println("�� �л� �� : " + sum);
		
		//�� ���
		float average = (float)sum / scores.length;
		System.out.println("�� �л� �� ��� : " + average);

		//�ִ� �ο�, �ּ� �ο�
		int max = scores[0]; //�ִ밪 ���ϴ� ������ 0�� �ε��� �� ����
		int min = scores[0]; //�ּҰ� ���ϴ� ������ 0�� �ε��� �� ����
		
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}else if (max > scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.println("�ִ� �ο� �� : " + max);
		System.out.println("�ּ� �ο� �� : " + min);
		
	}

}
