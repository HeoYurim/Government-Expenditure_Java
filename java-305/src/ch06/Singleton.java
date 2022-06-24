package ch06;

public class Singleton {
	
	//정적 필드
	private static Singleton st = new Singleton(); //객체 1개만 만들어지는 싱글톤 객체 생성
	//-> 자신을 멤버로 선언해서 메모리에 올려놓기
	
	//생성자
	private Singleton() {} 
	
	//정적 메소드
	static Singleton getInstance() {
		return st; //외부에서 선언된 st를 가여옴
	}
}
