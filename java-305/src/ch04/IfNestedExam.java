package ch04;

public class IfNestedExam {

	public static void main(String[] args) {

		//81~100 ���� ���� ������ �߻���Ų��.
		int score = (int)(Math.random() * 20) + 81;
		
		System.out.println("���� ������ : " + score);
		
		String grade;
		
		if(score >= 90) {	//90�� �̻������� ���´�.
			if(score >= 95) {	//95�� �̻������� ���´�.
				grade = "A+";	//95�� �̻��̸� A+
			}else {
				grade = "A";	//90�� �̻��̸� A
			}
		}else {
			if(score >= 85) {	//85�� �̻������� ���´�.
				grade = "B+";	//85�� �̻��̸� B+
			}else {
				grade = "B";	//85�� �̻��̸� B
			}
		}
		System.out.println("���� : " + grade);
	}

}
