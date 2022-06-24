package ch03;

public class SignOperatorEx {

	public static void main(String[] args) {

		int x = -100;		//음수 100을 x에 넣는다.
		int result1 = +x;	//음수에 +부호가 붙어서 부호가 유지된다.
		int result2 = -x;	//음수에 -부호가 붙어서 부호가 변경된다.
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " +result2);
		
		short s = 100;
	//	short result3 = -s; //계산에 기본 타입은 int이기 때문에 오류가 발생
		int result3 = -s;
		System.out.println("result3 = " +result3);
		
	}

}
