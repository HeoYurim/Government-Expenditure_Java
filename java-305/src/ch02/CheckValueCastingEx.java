package ch02;

public class CheckValueCastingEx {

	public static void main(String[] args) {

		long i = 128000000000000000L;
		
		if(i < (Double.MIN_VALUE) || (i > (Double.MAX_VALUE))) {
			//i의 값이 byte의 최솟값보다 작거나 최댓값보다 크면
			System.out.println("Double타입으로 변환할 수 없습니다.");
			System.out.println(Double.MIN_VALUE + "값보다 작거나");
			System.out.println(Double.MAX_VALUE + "값보다 큽니다.");
		} 
		else {
			double b = (double)i; //int를 byte로 강제타입변환
			System.out.println(b);
			System.out.println(Double.MIN_VALUE + "값보다 작거나");
			System.out.println(Double.MAX_VALUE + "값보다 큽니다.");
		}
		
	}

}
