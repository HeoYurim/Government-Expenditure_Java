package ch01;

public class Variable_test {

	public static void main(String[] args) {

		int v1 = 20;
		int v2 = 35;
		
		if(v1 > 15) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 - 12;
		
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		System.out.println("v3 = " + v3);

		
	}

}
