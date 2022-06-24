package ch07.extended.People;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		
		super(name, ssn); //부모의 생성자 호출
//		this.name = name; //부모의 생성자가 존재하기 때문에 기본 생성자가 아니면 super로 호출
//		this.ssn = ssn;
		this.studentNo = studentNo;
	}
}
