package ch05;

public class ArrayCreateEx2 {

	public static void main(String[] args) {

		int total1 = add(new int[] {70,80,90});
		int total2 = add(new int[] {60,70,80});
		int total3 = add(new int[] {90,80,50});

		System.out.println("1¹ÝÀÇ ÃÑÇÕ : " + total1);
		System.out.println("2¹ÝÀÇ ÃÑÇÕ : " + total2);
		System.out.println("3¹ÝÀÇ ÃÑÇÕ : " + total3);
	
//		int sum = add(new int[] {70,80,90});
//		System.out.println("ÃÑÇÕ : " + sum);
		
	}

	public static int add(int[] scores) {

		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
