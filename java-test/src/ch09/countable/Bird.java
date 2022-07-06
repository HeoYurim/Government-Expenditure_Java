package ch09.countable;

public class Bird implements Countable{

	String name;
	int num;
	
	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public void count() {
		System.out.println(name + "�� " + num +"���� �ִ�.");
	}
	
	void fly() {
		System.out.println(num + "���� " + name + "�� ���ư���.");
	}

}
