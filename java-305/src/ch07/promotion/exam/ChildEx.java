package ch07.promotion.exam;

public class ChildEx {
	
	public static void main(String[] args) {
		
		Child ch = new Child();
		Parent pr = ch; //�ڵ� Ÿ�� ��ȯ
		
		pr.method1();
		pr.method2();
//		pr.method3(); //�ڽĿ� �ִ� method3�� ȣ�� �Ұ�
		
	}
	
}
