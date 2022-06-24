package ch05;

public class ArrayExam2 {

	public static void main(String[] args) {

		//배열에 들어있는 값 중에 최대값과 최소값을 구하는 예제
		int[] scores = {78, 80, 91, 33, 100, 55, 95};
		
		int max = scores[0]; //최대값 구하는 변수에 0번 인덱스 값을 삽입
		int min = scores[0]; //최소값 구하는 변수에 0번 인덱스 값을 삽입
		
		//최대값과 최소값을 구하는 for문
		for(int i = 1; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}else if(min > scores[i]) {
				min = scores[i];
			}
		}
		
		//최대값 출력문 100
		System.out.println("최대값 : " + max);
		
		//최소값 출력문 33
		System.out.println("최소값 : " + min);
	}

}
