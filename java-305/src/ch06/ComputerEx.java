package ch06;

public class ComputerEx {

	public static void main(String[] args) {

		Computer myCom = new Computer(); //Computer °´Ã¼ »ý¼º
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : " + result2);
		
		int[] values3 = {1,2,3};
		int result3 = myCom.sum2(values3);
		System.out.println("result3 : " + result1);
		
		int result4 = myCom.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4 : " + result4);
		
		int result5 = myCom.sum2(1,2,3,4,5,6);
		System.out.println("result5 : " + result5);
	}

}
