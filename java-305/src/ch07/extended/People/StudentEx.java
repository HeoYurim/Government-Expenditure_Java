package ch07.extended.People;

public class StudentEx {

	public static void main(String[] args) {

		Student st = new Student("허유림", "990323-2134567", 1);
		
		System.out.println("name : " + st.name); //부모 클래스 상속
		System.out.println("ssn : " + st.ssn); //부모 클래스 상속
		System.out.println("학번 : " + st.studentNo); //자식 클래스
		
	}

}
