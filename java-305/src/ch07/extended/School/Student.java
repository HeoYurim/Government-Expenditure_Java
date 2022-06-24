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
		System.out.println("학생 이름 " + getName());
		System.out.println("학생 나이 " + getAge());
		System.out.println("학생 키 " + getHeight());
		System.out.println("학생 몸무게 " + getWeight());
		System.out.println("-----------------"); //부모 클래스로 생성
		System.out.println("학생 학번 " + getStudentID());
		System.out.println("학생 학년 " + getGrade());
		System.out.println("학생 학점 " + getGpa());
		System.out.println("-----------------");
	}
	
	
}
