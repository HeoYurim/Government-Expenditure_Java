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
		System.out.println("교직원 이름 " + getName());
		System.out.println("교직원 나이 " + getAge());
		System.out.println("교직원 키 " + getHeight());
		System.out.println("교직원 몸무게 " + getWeight());
		System.out.println("-----------------"); //부모 클래스로 생성
		System.out.println("교직원 학번 " + getTeacherID());
		System.out.println("교직원 월급 " + getMonthMoney());
		System.out.println("교직원 년차 " + getYear());
		System.out.println("-----------------");
	}
	
	

}
