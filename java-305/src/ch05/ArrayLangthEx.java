package ch05;

public class ArrayLangthEx {

	public static void main(String[] args) {

		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {	//0���� 2���� 1�� ����
			sum += scores[i];	//scores 0~2���� �հ踦 ���Ѵ�.
		}
		System.out.println("���� : " + sum);
		
		double avg = (double) sum/ scores.length;	//��տ� ���� ���ϱ�
		System.out.println("��� :  " + avg);
	}

}
