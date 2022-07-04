package ch13.genericWildcard;

public class Person {
	private String name; //필드
	
	public  Person(String name) { //생성자
		this.name = name;
	}
	
	public String getName() {return name;} //메소드
	public String toString() {return name;} 
}
