package ch07.extended.People;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		
		super(name, ssn); //�θ��� ������ ȣ��
//		this.name = name; //�θ��� �����ڰ� �����ϱ� ������ �⺻ �����ڰ� �ƴϸ� super�� ȣ��
//		this.ssn = ssn;
		this.studentNo = studentNo;
	}
}
