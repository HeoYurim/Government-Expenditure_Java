package ch05;

public class ArrayExam1 {

	public static void main(String[] args) {

		//���հ� ��� ���ϴ� �迭(�迭�� ��� ��Ҹ� ���ؼ� ������ ����� ���Ѵ�.
		int sum = 0; //������ �����ϱ� ���� ����
		float average = 0F; //����� �����ϱ� ���� ����
		
		int[] scores = {100, 88, 100, 100, 90}; //5���� �ڷḦ �����Ѵ�.
		
		//���� ���ϴ� ����
		for(int i = 0; i<scores.length; i++) {
			sum = sum += scores[i];
		}
			
		//��� ���ϴ� ����
		average = (float)sum / scores.length;
		
		System.out.print("�Է� ���� : ");
		//�Է� ���� ��¹�
		for(int i = 0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		
		System.out.println();
		
		//���� ��¹� 478
		System.out.println("���� : " + sum);
		//��� ��¹� 95.6
		System.out.println("��� : " + average);
	}

}
