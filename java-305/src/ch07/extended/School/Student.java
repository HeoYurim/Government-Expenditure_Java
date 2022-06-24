package ch07.extended.School;

public class Student extends Person{
	
	private String studentID;
	private int grade;
	private int gPA;
	
	//Getter Setter
	public String getStudentID() {return studentID;}
	public int getGrade() {return grade;}
	public int getGpa() {return gPA;}
	
	public void setStudentID(String studentID) {this.studentID = studentID;}	
	public void setGrade(int grade) {this.grade = grade;}	
	public void setGpa(int gPA) {this.gPA = gPA;}
	
	public Student(String name, int height, int weight, int age, String studentID, int grade, int gPA) {
		super(name, height, weight, age);
		this.studentID = studentID;
		this.grade = grade;
		this.gPA = gPA;
	}
	
	public void show() {
		System.out.println("-----------------");
		System.out.println("�л� �̸� " + getName());
		System.out.println("�л� ���� " + getAge());
		System.out.println("�л� Ű " + getHeight());
		System.out.println("�л� ������ " + getWeight());
		System.out.println("-----------------"); //�θ� Ŭ������ ����
		System.out.println("�л� �й� " + getStudentID());
		System.out.println("�л� �г� " + getGrade());
		System.out.println("�л� ���� " + getGpa());
		System.out.println("-----------------");
	}
	
	
}
