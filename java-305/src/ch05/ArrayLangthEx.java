package ch05;

public class ArrayLangthEx {

	public static void main(String[] args) {

		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {	//0부터 2까지 1씩 증가
			sum += scores[i];	//scores 0~2까지 합계를 구한다.
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum/ scores.length;	//평균용 개수 구하기
		System.out.println("평균 :  " + avg);
	}

}
