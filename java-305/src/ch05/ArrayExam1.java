package ch05;

public class ArrayExam1 {

	public static void main(String[] args) {

		//총합과 평균 구하는 배열(배열의 모든 요소를 더해서 총점과 평균을 구한다.
		int sum = 0; //총점을 저장하기 위한 변수
		float average = 0F; //평균을 저장하기 위한 변수
		
		int[] scores = {100, 88, 100, 100, 90}; //5개의 자료를 제공한다.
		
		//총점 구하는 공식
		for(int i = 0; i<scores.length; i++) {
			sum = sum += scores[i];
		}
			
		//평균 구하는 공식
		average = (float)sum / scores.length;
		
		System.out.print("입력 점수 : ");
		//입력 점수 출력문
		for(int i = 0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		
		System.out.println();
		
		//총점 출력문 478
		System.out.println("총점 : " + sum);
		//평균 출력문 95.6
		System.out.println("평균 : " + average);
	}

}
