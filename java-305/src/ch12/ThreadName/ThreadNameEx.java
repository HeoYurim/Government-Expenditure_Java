package ch12.ThreadName;

public class ThreadNameEx {

	public static void main(String[] args) {
		
		//������ ��ü ���
		Thread mainTread = Thread.currentThread();

		//���� ������ �̸� Ȯ��
		System.out.println("���α׷� ���� ������ �̸� : " + mainTread.getName());
		
		ThreadA thA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + thA.getName());
		thA.start();
		
		ThreadB thB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + thB.getName());
		thB.start();
	}

}
