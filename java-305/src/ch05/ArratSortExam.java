package ch05;

public class ArratSortExam {

	public static void main(String[] args) {
		int[] scores = {79, 88, 91, 33, 100, 55, 95};
		
		for(int i = 0; i < scores.length; i++) {	//�迭 �� ���
			System.out.print(scores[i] + " ");
		}
		
		for(int j = 0; j < scores.length-1; j++) { //0~6���� �ݺ��ϴ� ��(�� 6����Ŭ)
			for(int k = 0; k < scores.length-1-j; k++) { //0~6���� �ݺ��� / 0~5���� / 0~4����
				if(scores[k] > scores[k+1]) { //0���� 1���� ���ؼ� ũ�� �ڸ��ٲ� / 1���� 2�� �� / 3���� 4�� �� /... 
					int tmp = scores[k]; //0���� ũ�� tmp�� ���� ����
					scores[k] = scores[k+1]; //0���� ���� ���� ����
					scores[k+1] = tmp; // 1���� ū ���� ����
 				}
			}
		}
		System.out.println();
		for(int i = 0; i < scores.length; i++) {	//�迭 �� ���
			System.out.print(scores[i] + " ");
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
		
	}

}
