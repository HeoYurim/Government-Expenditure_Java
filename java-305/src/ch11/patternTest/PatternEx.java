package ch11.patternTest;

import java.util.regex.*;

public class PatternEx {

	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		//(02|010) 02�̰ų� 010���� �Է� ����
		// - �� �־�� ��
		// \\d{3,4} \\d�� \�� �Է��ϱ� ���ؼ� �� �� �ۼ� 3~4�� ���� ����
		// \\d{4} ������ 4���� ���� ����
		String data = "010-123-4567";
		
		//Pattern.matches(���Խ�, ������ ���ڿ�)
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// \\w+ �� �� �̻��� ���ĺ� �Ǵ� ����
		// \\. �� �� �̻��� ���ĺ� �Ǵ� ���� �ڿ� . ����
		// (\\.\\w+)? �ѹ� �� �� �� ���� -> id@naver.com / id@kkw.or.kr
		data = "angel@kkk.or.kr";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}

}
