package ch03;

public class CheckOverFlowEx {

	public static void main(String[] args) {

		try { //예외를 처리하는 문
			int result = safeAdd(200000, 200000); //오류 없을 때 실행
			System.out.println(result); //오류 없을 때 출력
		}
		catch(ArithmeticException e){ //검증 시 오류에 대한 처리문
			System.out.println("오버플로우 발생 : 계산할 수 없음.");
		}
	}

	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버 플로우 발생");
			}
		}
		else {
				if(left < (Integer.MIN_VALUE - right)) {
					throw new ArithmeticException("오버 플로우 발생");
				}
			}
			return left + right;
		}
}