package ch05;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//총 반의 수 입력
		System.out.print("총 반의 수를 입력하세요 : ");
		int people = scan.nextInt();
		int scores[] = new int[people];
		
		//각 반의 인원 수 입력
		for(int i = 0; i< scores.length; i++) {
			System.out.print("반의 인원 수를 입력하세요 -> ");
			scores[i] = scan.nextInt();
		}
		
		//낮은 숫자 순으로 정렬
		for(int j = 0; j < scores.length-1; j++) { //인원수 만큼 돌고
			for(int z = 0; z<scores.length-1-j; z++) {
				if(scores[z] < scores[z+1]) {//순서와 뒷 순서를 비교해 작으면 자리 바꿈
					int tmp = scores[z];
					scores[z] = scores[z+1];
					scores[z+1] = tmp;
				}
			}
		}
		System.out.println();
		
		//총 학생 수
		for(int i = 0; i <scores.length; i++) {
			sum = sum += scores[i];
		}
		System.out.println("총 학생 수 : " + sum);
		
		//총 평균
		float average = (float)sum / scores.length;
		System.out.println("총 학생 수 평균 : " + average);

		//최대 인원, 최소 인원
		int max = scores[0]; //최대값 구하는 변수에 0번 인덱스 값 삽입
		int min = scores[0]; //최소값 구하는 변수에 0번 인덱스 값 삽입
		
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}else if (max > scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.println("최대 인원 수 : " + max);
		System.out.println("최소 인원 수 : " + min);
		
	}

}
