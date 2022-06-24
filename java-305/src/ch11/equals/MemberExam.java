package ch11.equals;

public class MemberExam {

	public static void main(String[] args) {
		Member obj1 = new Member("kkw");
		Member obj2 = new Member("kkw");
		Member obj3 = new Member("hgd");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2가 동등합니다.");
		} else {
			System.out.println("obj1과 obj2가 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3가 동등합니다.");
		} else {
			System.out.println("obj1과 obj3가 동등하지 않습니다.");
		}
	}

}
