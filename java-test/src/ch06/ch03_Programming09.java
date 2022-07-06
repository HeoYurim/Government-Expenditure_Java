package ch06;

public class ch03_Programming09 {

	public static void main(String[] args) {

		foo("æ»≥Á",1);
		foo("æ»≥Á«œººø‰",1,2);
		foo("¿ﬂ ¿÷æÓ");
		
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
