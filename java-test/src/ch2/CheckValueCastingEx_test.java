package ch2;

public class CheckValueCastingEx_test {

	public static void main(String[] args) {

		long i = 12800000000000000L;
		
		//i값이 double의 최솟값보다 작거나 최댓값보다 크면 double 타입 변환할 수 없다는 메세지
		if(i < (Double.MIN_VALUE) || (i > (Double.MAX_VALUE))) {
			System.out.println("Double 타입으로 변환할 수 없다.");
			System.out.println(Double.MIN_VALUE + "값보다 작습니다.");
			System.out.println(Double.MAX_VALUE + "값보다 큽니다.");
		}
		//그게 아닌 경우는 i를 double A 값으로 바꾼 후 A값 출력, 최솟값보다 작거나 최댓값보다 크다는 메세지 출력
		else {
			double A = (double)i;
			System.out.println(A);
			System.out.println(Double.MIN_VALUE + "값보다 작거나");
			System.out.println(Double.MAX_VALUE + "값보다 큽니다.");
		}
	}

}
