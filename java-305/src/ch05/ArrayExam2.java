package ch05;

public class ArrayExam2 {

	public static void main(String[] args) {

		//�迭�� ����ִ� �� �߿� �ִ밪�� �ּҰ��� ���ϴ� ����
		int[] scores = {78, 80, 91, 33, 100, 55, 95};
		
		int max = scores[0]; //�ִ밪 ���ϴ� ������ 0�� �ε��� ���� ����
		int min = scores[0]; //�ּҰ� ���ϴ� ������ 0�� �ε��� ���� ����
		
		//�ִ밪�� �ּҰ��� ���ϴ� for��
		for(int i = 1; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}else if(min > scores[i]) {
				min = scores[i];
			}
		}
		
		//�ִ밪 ��¹� 100
		System.out.println("�ִ밪 : " + max);
		
		//�ּҰ� ��¹� 33
		System.out.println("�ּҰ� : " + min);
	}

}
