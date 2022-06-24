package ch07.extended.Person;

public class Student extends Person{
	
	int studentnum; //자식 필드 추가
	String studentgrade;
	int studentschoolnum;
	
	//생성자
	Student(String name, double cm, int age, double kg, int studentnum, String studentgrade, int studentschoolnum) {

		this.name = name; //부모필드
		this.cm = cm; //부모필드
		this.age = age; //부모필드
		this.kg = kg; //부모필드
		this.studentnum = studentnum; //자식필드
		this.studentgrade = studentgrade; //자식필드
		this.studentschoolnum = studentschoolnum; //자식필드
	}
	
	void receiveOn() {
		System.out.println("Student 정보를 받습니다.");
	}
	
	void receiveOff() {
		System.out.println("Student 정보를 받습니다.");
	}
	
	public static void main(String[] args) {
		
		//생성자로 초기값 전달
		Student sp = new Student("MIT", 162.1, 25, 58.4, 201858068, "A", 4);
		
		sp.StudentOn();
		
		//부모로 받은 필드 활용 출력
		System.out.println("이름 : " + sp.name);
		System.out.println("키 : " + sp.cm);
		System.out.println("나이 : " + sp.age);
		System.out.println("몸무게 : " + sp.kg);
		System.out.println("학번 : " + sp.studentnum);
		System.out.println("학점 : " + sp.studentgrade);
		System.out.println("학년 : " + sp.studentschoolnum);
		
		sp.StudentOff();
	}
	
}
