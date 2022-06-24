package ch02;

public class VarDemoEx {
//	var a = 1; 메소드 안에서 사용할 수 있다.

	public static void main(String[] args) {

		int var = 1;  // var 예약어는 변수명으로 사용 가능하다.
		var x = 1;    // x변수의 타입은 int로 추론할 수 있다.
		
		int result = var + x;  // 1+1
		
		System.out.println(result);
		
	//	var x1 = 1, y1 = 3, z1 = 4;  // var을 사용하여 다수의 변수를 하나의 실행문으로 초기화 할 수 없다.
		var x1 = 1;
		var y1 = 3;
		var z1 = 4;
		byte result1 = (byte)(x1 + y1 + z1);
		
	//	var str = null; // var 변수에 null을 대입할 수 없다.
		
		
	}

}
