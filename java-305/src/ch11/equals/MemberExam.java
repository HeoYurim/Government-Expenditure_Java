package ch11.equals;

public class MemberExam {

	public static void main(String[] args) {
		Member obj1 = new Member("kkw");
		Member obj2 = new Member("kkw");
		Member obj3 = new Member("hgd");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
