package ch03;

public class CompareOperatorEx2 {

	public static void main(String[] args) {

		int v2 = 1;		    //정수 -> double
		double v3 = 1.0;	//실수
		System.out.println(v2 == v3);	//1이 1.0과 같은지 비교 출력
		//비교연산자도 연산을 수행하기 전에 타입변환을 통해 큰 타입으로 일치 시킨다.
		
		System.out.println("--------------");
		
		double v4 = 0.1;
		float v5 = 0.1F;	//지수와 가수를 사용하는 부동소수점 연산으로 근사값이 표현
		
		System.out.println(v4 == v5);	//false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4 * 10) == (int)(v5 * 10)); //true
		
		
	}

}
