package ch6;

public class ch03Programming05 {

	public static void main(String[] args) {

		for(int a = 1; a<10; a++) {
			for(int b =1; b<10; b++) {
				for(int c=1; c<10; c++) {
					if((a*a+ b*b == c*c) &&(a+b+c <= 20)) {
						System.out.print("a = " + a + " b = " + b + " c = "+ c);
						System.out.println();
					}
				}
			}
		}
		
	}

}
