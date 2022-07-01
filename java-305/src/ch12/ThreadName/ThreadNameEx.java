package ch12.ThreadName;

public class ThreadNameEx {

	public static void main(String[] args) {
		
		//스레스 객체 얻기
		Thread mainTread = Thread.currentThread();

		//메인 스레드 이름 확인
		System.out.println("프로그램 시작 스레드 이름 : " + mainTread.getName());
		
		ThreadA thA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + thA.getName());
		thA.start();
		
		ThreadB thB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + thB.getName());
		thB.start();
	}

}
