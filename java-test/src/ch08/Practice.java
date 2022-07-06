package ch08;

import java.text.*;

public class Practice {

	public static void main(String[] args) {
	//	Calendar c = new Calendar();
	//	Integer i = new Integer.valueOf(10);
		
	/*	//8¹ø
		Double d1 = 100.0;
		Double d2 = 100.0;
		if(d1.equals(d2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	*/
		//9¹ø
		double d = 123456.789;
		DecimalFormat df = new DecimalFormat("#");
		System.out.println(df.format(d));
	}
}
