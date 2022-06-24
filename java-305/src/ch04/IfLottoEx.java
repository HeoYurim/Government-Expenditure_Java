package ch04;

public class IfLottoEx {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.printf("이번주 추천 로또 번호는 ▶  %d , %d, %d, %d, %d, %d" , num, num2, num3, num4, num5, num6);
		
		
	}

}
