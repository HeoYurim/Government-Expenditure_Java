package ch08.Count;

public class Tree implements Countable {

	String name;
	public Tree(String name){
		this.name = name;
	};
	
	void is() {System.out.println(name + "에 열매가 있다.");}
	
	@Override
	public void count() {
		System.out.println(name + "가 5그루가 있다.");
	}

}
