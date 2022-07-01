package ch12.ThreadCalc;

public class Calculator {
	//���� ��ü ����
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		synchronized(this) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2�ʰ� �Ͻ� ����
		}catch(InterruptedException e) {}
		
		//������ �̸��� ��
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}//����ȭ ��� ����
	}
}
