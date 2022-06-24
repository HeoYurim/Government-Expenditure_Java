package ch05;

public class ArrayCreateEx3 {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		
		System.out.println("-----------------------------");
		
		double[] arr2 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}	
		arr2[0] = 10.0;
		arr2[1] = 20.0;
		arr2[2] = 30.0;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		
		System.out.println("-----------------------------");
		
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}	
		arr3[0] = "허유림";
		arr3[1] = "엠아이티";
		arr3[2] = "자바";
		for(int i = 0; i < 3; i++) {
			System.out.println("arr4[" + i + "]" + arr3[i]);
		}
	}

}
