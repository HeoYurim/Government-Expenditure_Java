package ch07.extended.School;

public class Teacher extends Person{
	
	private String teacherID;
	private int monthMoney;
	private int year;
	
	//Getter Setter
	public String getTeacherID() {return teacherID;}
	public void setTeacherID(String teacherID) {this.teacherID = teacherID;}
	public int getMonthMoney() {return monthMoney;}
	
	public void setMonthMoney(int monthMoney) {this.monthMoney = monthMoney;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	
	public Teacher(String name, int height, int weight, int age,String teacherID, int monthMoney, int year) {
		super(name, height, weight, age);
		this.teacherID = teacherID;
		this.monthMoney = monthMoney;
		this.year = year;
	}
	
	public void show() {
		System.out.println("-----------------");
		System.out.println("������ �̸� " + getName());
		System.out.println("������ ���� " + getAge());
		System.out.println("������ Ű " + getHeight());
		System.out.println("������ ������ " + getWeight());
		System.out.println("-----------------"); //�θ� Ŭ������ ����
		System.out.println("������ �й� " + getTeacherID());
		System.out.println("������ ���� " + getMonthMoney());
		System.out.println("������ ���� " + getYear());
		System.out.println("-----------------");
	}
	
	

}
