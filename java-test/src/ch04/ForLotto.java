package ch04;

public class ForLotto {

	public static void main(String[] args) {
		
		System.out.print("�̹��� ��õ �ζ� ��ȣ�� �� ");
		
		for(int i =0; i<6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			System.out.print(num + " ");
		}
		

	}

}
