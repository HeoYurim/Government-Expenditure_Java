package ch04;

public class ForLotto {

	public static void main(String[] args) {
		
		System.out.print("이번주 추천 로또 번호는 ▶ ");
		
		for(int i =0; i<6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			System.out.print(num + " ");
		}
		

	}

}
