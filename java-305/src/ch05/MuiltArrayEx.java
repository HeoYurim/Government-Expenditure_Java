package ch05;

public class MuiltArrayEx {

	public static void main(String[] args) {
		
		int[][] scores = new int[2][];
		scores[0] = new int[2]; //0�࿡ �ش��ϴ� 2���� ���� ����
		scores[1] = new int[3]; //1�࿡ �ش��ϴ� 3���� ���� ����
		
		System.out.println("���� ������ Ȯ�� : " + scores.length);
		System.out.println("0���� ������ Ȯ�� : " + scores[0].length);
		System.out.println("1���� ������ Ȯ�� : " + scores[1].length);
		
		/*
		int[][] scores = new int[2][3];	//2�� 3�� 2���� �迭 ����
		
		System.out.println("���� ������ Ȯ�� : " + scores.length);
		System.out.println("0���� ������ Ȯ�� : " + scores[0].length);
		System.out.println("1���� ������ Ȯ�� : " + scores[1].length);
		 */
	}

}
