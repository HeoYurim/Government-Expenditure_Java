package ch06;

public class ch03_Programming09 {

	public static void main(String[] args) {

		foo("�ȳ�",1);
		foo("�ȳ��ϼ���",1,2);
		foo("�� �־�");
		
	}

	
	static void foo(String string, int i) {
		System.out.printf("%s %d\n" ,string,i);
		
	}

	static void foo(String string, int i, int j) {
		System.out.printf("%s %d %d\n" ,string,i,j);
		
	}
	
	static void foo(String string) {
			System.out.printf("%s\n" , string);
		}

}
