package ch01;

public class Variable {

	public static void main(String[] args) {

		int v1 = 15;
		int v2 = 0;
		
		if(v1 > 10) { //if�� �񱳹����� true�� false�� �Ǵ�
			
			v2 = v1 + 10;
			
		}
		
		int v3 = v1 + v2 + 5;
		
		System.out.println("v1�� �� " + v1);
		System.out.println("v2�� �� " + v2);
		System.out.println("v3�� �� " + v3);

	}

}