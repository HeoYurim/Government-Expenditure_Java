package ch05;

public class ArrayCreateEx {

	public static void main(String[] args) {

		int [] scores = null;
		scores = new int[] {83, 90, 87};	//������ ����(��ü �������� ����)
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
			System.out.println(i+"��° �� : " + sum);		//������ ���ϴ� ���

		}
		
		System.out.println("���� : " + sum);
		double avg = (double)sum / 3;
		
		System.out.println("��� : " + avg);
	}

}
