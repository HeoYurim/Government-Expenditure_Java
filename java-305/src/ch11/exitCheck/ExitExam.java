package ch11.exitCheck;

public class ExitExam {
	public static void main(String[] args) {
		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		}); // 익명 구현 객체
		for (int i = 0; i < 10; i++) {
			System.out.println(i); // 0~9까지의 증가값 출력
			try {
				System.exit(i);// JVM 종료 요청
			} catch(SecurityException e) {
				
			}
		}
	}
}
