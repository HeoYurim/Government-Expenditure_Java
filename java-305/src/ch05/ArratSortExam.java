package ch05;

public class ArratSortExam {

	public static void main(String[] args) {
		int[] scores = {79, 88, 91, 33, 100, 55, 95};
		
		for(int i = 0; i < scores.length; i++) {	//배열 값 출력
			System.out.print(scores[i] + " ");
		}
		
		for(int j = 0; j < scores.length-1; j++) { //0~6까지 반복하는 문(총 6싸이클)
			for(int k = 0; k < scores.length-1-j; k++) { //0~6까지 반복문 / 0~5까지 / 0~4까지
				if(scores[k] > scores[k+1]) { //0번과 1번을 비교해서 크면 자리바꿈 / 1번과 2번 비교 / 3번과 4번 비교 /... 
					int tmp = scores[k]; //0번이 크면 tmp에 값을 대입
					scores[k] = scores[k+1]; //0번에 작은 값을 대입
					scores[k+1] = tmp; // 1번에 큰 값을 대입
 				}
			}
		}
		System.out.println();
		for(int i = 0; i < scores.length; i++) {	//배열 값 출력
			System.out.print(scores[i] + " ");
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
		
	}

}
