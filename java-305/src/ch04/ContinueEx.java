package ch04;

public class ContinueEx {

	public static void main(String[] args) {

		for(int i = 1; i <=10; i++) { //i�� 1~10���� 1�� ����
			if(i%2 != 0) { //¦���� �ƴ�(Ȧ��)
				continue;
			}
			System.out.println(i);
		}
		
	}

}
