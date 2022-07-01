package ch12.threadTest;

public class TaskEx {

	public static void main(String[] args) {
		/*
		//Tesk 구현 객체를 다형성으로 구현
		Runnable Tk = new Tesk();
		
		//Thread 생성자를 호출하면 작업 스레드가 생성된다.
		Thread th = new Thread(Tk);
		*/
		
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//스레드가 실행할 코드 
			} //run 종료
		}); // 익명 구현 객체
	}
}
