package ch12.priority;

public class PriorityEx {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			Thread th = new CalcThread("thread" + i);
			if(i != 10) {
				//10�� �ƴϸ� �켱������ �ּҰ�����
				th.setPriority(Thread.MIN_PRIORITY);
			}else {
				//10�̸� �켱������ �ִ밪���� ����
				th.setPriority(Thread.MAX_PRIORITY);
			}
			th.start();
		} //�����带 10�� �ݺ��ؼ� ����
	}

}
