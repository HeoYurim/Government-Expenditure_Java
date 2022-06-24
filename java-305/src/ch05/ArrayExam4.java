package ch05;

import java.util.Scanner;

public class ArrayExam4 {

	public static void main(String[] args) {

		boolean run = true; //프로그램 실행과 종료를 결정 -> while
		int studentNum = 0; //학생 수를 입력하여 배열을 결정
		int [] scores = null; //학생 수를 파악하여 배열을 생성
		
		Scanner scan = new Scanner(System.in); //키보드로 입력 받는 객체
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("(1~5까지의 숫자 중) 번호를 선택하시오 -> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) { //학생 수를 입력하여 배열 생성
				System.out.print("학생 수를 입력하세요 >> ");
				studentNum = scan.nextInt(); //학생 수를 변수에 삼입
				scores = new int[studentNum]; //배열 객체를 생성하여 scores 변수에 삽입
				
			}else if(selectNo == 2) { //학생 수만큼 반복하여 점수를 입력
				for(int i = 0; i < scores.length; i++) {
					System.out.print("점수[ " + i + " ] 입력하세요 >> "); //점수[0] 입력 >>
					scores[i] = scan.nextInt();
				}
				
			}else if(selectNo == 3) { //입력된 점수를 출력
				for(int i = 0; i < scores.length; i++) {
					System.out.println("점수[ " + i + " ] : "+ scores[i]); //점수 [0] 출력
				}
				
			}else if(selectNo == 4) { //분석 : 최고점수, 평균
				int max = 0;
				int min = 0;
				int sum = 0;
				double avg = 0.0;
				for(int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max ; //최대값
					sum += scores[i]; //총점
				}
				avg = (double) sum / studentNum; //평균
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
			}else if(selectNo == 5) {
				run = false;
			} // if 종료			
		} //while 종료
		System.out.println("프로그램 종료");
	} //main 종료
} //class 종료
