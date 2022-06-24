package ch04;

public class BreakOutterEx {

	public static void main(String[] args) {

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {		//A~Z까지 반복
			 for (char lower = 'a'; lower <= 'z'; lower++) { 	//a~z까지 반복
				System.out.println(upper + " - " + lower);	//출력
				if (lower == 'c') {	//c가 나오면 break문 실행
					break Outter; //Outter는 라벨문으로 break의 범위를 결정
				}
			}
		}

	}

}
