package ch11.time;

public class SystemTimeExam {

	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); //���α׷� ���� �ð�
		
		//1~1000000�� �հ踦 ���
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~1000000������ �� : " + sum);
		
		long time2 = System.nanoTime(); //���α׷� ���� �ð�
		
		System.out.println("��꿡 " + (time2-time1) + " �����ʰ� �ҿ� �Ǿ����ϴ�.");
	}

}
