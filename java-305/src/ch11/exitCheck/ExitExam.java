package ch11.exitCheck;

public class ExitExam {
	public static void main(String[] args) {
		// ���� ������ ����
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		}); // �͸� ���� ��ü
		for (int i = 0; i < 10; i++) {
			System.out.println(i); // 0~9������ ������ ���
			try {
				System.exit(i);// JVM ���� ��û
			} catch(SecurityException e) {
				
			}
		}
	}
}
