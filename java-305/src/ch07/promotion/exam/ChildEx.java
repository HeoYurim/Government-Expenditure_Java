package ch07.promotion.exam;

public class ChildEx {
	
	public static void main(String[] args) {
		
		Child ch = new Child();
		Parent pr = ch; //자동 타입 변환
		
		pr.method1();
		pr.method2();
//		pr.method3(); //자식에 있는 method3은 호출 불가
		
	}
	
}
