package ch05;

public class ArrayCreateEx {

	public static void main(String[] args) {

		int [] scores = null;
		scores = new int[] {83, 90, 87};	//컨파일 오류(객체 생성되지 않음)
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
			System.out.println(i+"번째 합 : " + sum);		//총점을 구하는 방법

		}
		
		System.out.println("총점 : " + sum);
		double avg = (double)sum / 3;
		
		System.out.println("평균 : " + avg);
	}

}
