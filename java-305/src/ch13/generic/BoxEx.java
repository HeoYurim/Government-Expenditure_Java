package ch13.generic;

public class BoxEx {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		//Box ��ü�� ������ �� String�� ����ؼ� ����
		//name�� ���� Ÿ�� ��ȯ ���̵� Ȱ���Ѵ�.
		//String Ÿ�� �Ķ���ͷθ� �����Ѵ�. 
		box.set("ȫ�浿"); 
		String name = (String) box.get(); 
		
		//Ÿ�� �Ķ���͸� Integer Ÿ������ �����Ѵ�.
		Box<Integer> boxI = new Box<Integer>();
		boxI.set(6);
		int value = boxI.get();
	}

}

/*
public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿"); //String �ڵ� Ÿ�� ��ȯ
		String name = (String) box.get(); //String ���� Ÿ�� ��ȯ
		
		box.set(new Apple()); //Apple �ڵ� Ÿ�� ��ȯ
		Apple apple = (Apple) box.get(); //Apple ���� Ÿ�� ��ȯ
		
		//Ŭ������ ������
	}

}
*/