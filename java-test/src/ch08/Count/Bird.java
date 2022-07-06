package ch08.Count;

public class Bird implements Countable{

	String name;
	public Bird(String name){
		this.name = name;
	};
	
	void fly() {
		System.out.println(name + "가 날라간다.");
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
		
	};

}
