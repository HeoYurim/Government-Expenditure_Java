package ch12.priority;

public class PriorityEx {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			Thread th = new CalcThread("thread" + i);
			if(i != 10) {
				//10이 아니면 우선순위를 최소값으로
				th.setPriority(Thread.MIN_PRIORITY);
			}else {
				//10이면 우선순위를 최대값으로 설정
				th.setPriority(Thread.MAX_PRIORITY);
			}
			th.start();
		} //스레드를 10개 반복해서 생성
	}

}
