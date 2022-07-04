package ch13.generic;

public class BoxEx {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		//Box 객체를 생성할 때 String을 사용해서 생성
		//name을 강제 타입 변환 없이도 활용한다.
		//String 타입 파라미터로만 한정한다. 
		box.set("홍길동"); 
		String name = (String) box.get(); 
		
		//타입 파라미터를 Integer 타입으로 한정한다.
		Box<Integer> boxI = new Box<Integer>();
		boxI.set(6);
		int value = boxI.get();
	}

}

/*
public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); //String 자동 타입 변환
		String name = (String) box.get(); //String 강제 타입 변환
		
		box.set(new Apple()); //Apple 자동 타입 변환
		Apple apple = (Apple) box.get(); //Apple 강제 타입 변환
		
		//클래스의 다형성
	}

}
*/