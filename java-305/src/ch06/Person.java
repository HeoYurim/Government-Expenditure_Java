package ch06;

public class Person {
	
	//필드 생성(객체의 데이터가 저장되는 곳)
	final String nation = "Korea"; //초기값 있음
	final String ssn; //초기값 없음(생성자로 받음)
	String name; //일반 필드 선언
	
	//생성자 생성
	public Person(String ssn, String name) {
		this.ssn = ssn; //this는 필드에 있는 값을 가져옴
		this.name = name;
	}
}
