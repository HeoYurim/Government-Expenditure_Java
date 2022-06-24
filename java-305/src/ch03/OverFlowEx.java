package ch03;

public class OverFlowEx {

	public static void main(String[] args) {

		 long x = 1000000;
		 long y = 1000000;
		 long z = x * y;  //1000000000000
		 
		 System.out.println(z);
		
	}

}
