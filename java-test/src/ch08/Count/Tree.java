package ch08.Count;

public class Tree implements Countable {

	String name;
	public Tree(String name){
		this.name = name;
	};
	
	void is() {System.out.println(name + "�� ���Ű� �ִ�.");}
	
	@Override
	public void count() {
		System.out.println(name + "�� 5�׷簡 �ִ�.");
	}

}
