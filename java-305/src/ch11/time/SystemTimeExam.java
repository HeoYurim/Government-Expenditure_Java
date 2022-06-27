package ch11.time;

public class SystemTimeExam {

	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); //프로그램 시작 시간
		
		//1~1000000의 합계를 계산
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~1000000까지의 합 : " + sum);
		
		long time2 = System.nanoTime(); //프로그램 종료 시간
		
		System.out.println("계산에 " + (time2-time1) + " 나노초가 소요 되었습니다.");
	}

}
