package ch12.beepTest2;

public class BeepTaskEx {

	public static void main(String[] args) {
		Runnable bt = new BeepTask(); //BeepTask Runnable 다형성
		Thread th1 = new Thread(bt); //BeepTask 스레드 객체 생성
		th1.start(); //작업 스레드 1 시작
		
		for(int i = 0; i < 10; i++) {
			System.out.println("띠리링");
			try {
				Thread.sleep(1000); //1초 동안 대기 상태
			}catch(Exception e) {
				System.out.println("오류 발생");
			}
		}
	}

}
