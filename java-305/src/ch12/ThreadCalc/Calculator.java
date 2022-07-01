package ch12.ThreadCalc;

public class Calculator {
	//공유 객체 생성
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		synchronized(this) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2초간 일시 정지
		}catch(InterruptedException e) {}
		
		//쓰레드 이름과 값
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}//동기화 블록 종료
	}
}
