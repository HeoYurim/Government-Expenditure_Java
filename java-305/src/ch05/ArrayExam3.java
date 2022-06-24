package ch05;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {

		int student = 0;
		int sum = 0;
		float average = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 : ");
		student = scan.nextInt();
		int scores[] = new int[student];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			scores[i] = scan.nextInt();
		}
		
		for(int j = 0; j < scores.length-1; j++) { //0~6까지 반복하는 문(총 6싸이클)
			for(int k = 0; k < scores.length-1-j; k++) { //0~6까지 반복문 / 0~5까지 / 0~4까지
				if(scores[k] < scores[k+1]) { //0번과 1번을 비교해서 작으면 자리바꿈 / 1번과 2번 비교 / 3번과 4번 비교 /... 
					int tmp = scores[k]; //0번이 작으면 tmp에 값을 대입
					scores[k] = scores[k+1]; //0번에 큰 값을 대입
					scores[k+1] = tmp; // 1번에 작은 값을 대입
 				}
			}
		}
		System.out.println();
		for(int i = 0; i < scores.length; i++) {	//배열 값 출력
			System.out.print(scores[i] + " ");
		}

		// 총점 구하는 공식
		for (int i = 0; i < scores.length; i++) {
			sum = sum += scores[i];
		}
		// 평균 구하는 공식
		average = (float) sum / scores.length;

		System.out.println();

		// 총점 출력문
		System.out.println("총점 : " + sum);
		// 평균 출력문
		System.out.println("평균 : " + average);

		int max = scores[0]; // 최대값 구하는 변수에 0번 인덱스 값을 삽입
		int min = scores[0]; // 최소값 구하는 변수에 0번 인덱스 값을 삽입

		// 최대값과 최소값을 구하는 for문
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			} else if (min > scores[i]) {
				min = scores[i];
			}
		}

		// 최대값 출력문
		System.out.println("최대값 : " + max);

		// 최소값 출력문
		System.out.println("최소값 : " + min);
	}

}
