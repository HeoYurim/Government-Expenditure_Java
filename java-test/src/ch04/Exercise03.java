package ch04;

public class Exercise03 {

	public static void main(String[] args) {

		int sum = 0;
		
//		for(int i = 1; i <=100; i++) {
//			if(i % 3 != 0) {
//				continue;
//			}
//			else if(i % 3 == 0){
//				sum = sum +i;
//			}
//		}
//		System.out.println("3�� ����� ��: " + sum);
		
		for(int i = 1; i <=100; i++) {
		
			if(i % 3 == 0){
				sum = sum +i;
			}
		}
		System.out.println("3�� ����� ��: " + sum);
	}

}
