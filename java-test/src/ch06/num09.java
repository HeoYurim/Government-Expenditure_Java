package ch06;

public class num09 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 0; i <5; i++) {
			if(i % 3 ==0 ) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}

}
