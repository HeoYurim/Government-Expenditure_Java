package ch05;

import java.util.Scanner;

public class ArrayExam4 {

	public static void main(String[] args) {

		boolean run = true; //���α׷� ����� ���Ḧ ���� -> while
		int studentNum = 0; //�л� ���� �Է��Ͽ� �迭�� ����
		int [] scores = null; //�л� ���� �ľ��Ͽ� �迭�� ����
		
		Scanner scan = new Scanner(System.in); //Ű����� �Է� �޴� ��ü
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. �л� �� | 2. ���� �Է� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
			System.out.println("----------------------------------------------------");
			System.out.print("(1~5������ ���� ��) ��ȣ�� �����Ͻÿ� -> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) { //�л� ���� �Է��Ͽ� �迭 ����
				System.out.print("�л� ���� �Է��ϼ��� >> ");
				studentNum = scan.nextInt(); //�л� ���� ������ ����
				scores = new int[studentNum]; //�迭 ��ü�� �����Ͽ� scores ������ ����
				
			}else if(selectNo == 2) { //�л� ����ŭ �ݺ��Ͽ� ������ �Է�
				for(int i = 0; i < scores.length; i++) {
					System.out.print("����[ " + i + " ] �Է��ϼ��� >> "); //����[0] �Է� >>
					scores[i] = scan.nextInt();
				}
				
			}else if(selectNo == 3) { //�Էµ� ������ ���
				for(int i = 0; i < scores.length; i++) {
					System.out.println("����[ " + i + " ] : "+ scores[i]); //���� [0] ���
				}
				
			}else if(selectNo == 4) { //�м� : �ְ�����, ���
				int max = 0;
				int min = 0;
				int sum = 0;
				double avg = 0.0;
				for(int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max ; //�ִ밪
					sum += scores[i]; //����
				}
				avg = (double) sum / studentNum; //���
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
				
			}else if(selectNo == 5) {
				run = false;
			} // if ����			
		} //while ����
		System.out.println("���α׷� ����");
	} //main ����
} //class ����
