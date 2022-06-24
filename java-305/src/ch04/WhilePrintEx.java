package ch04;

public class WhilePrintEx {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
	
		System.out.println(sum);
		
		/*
		while(i <= 10) {
			System.out.println(i);
			i++;	//증감식을 꼭 넣어야 한다.
					//없으면 무한 루프에 빠진다.
		}
		*/
	}
}
