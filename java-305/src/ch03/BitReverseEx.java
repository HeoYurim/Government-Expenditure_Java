package ch03;

public class BitReverseEx {

	public static void main(String[] args) {
		
		int v1 = 10;	//int v1에 10을 삽입
		int v2 = ~v1;	//int v2에 10을 비트반전을 실행
		int v3 = ~v1 + 1;	//int v2값에 1을 더한다.
		
		System.out.println(toBinaryString(v1) + "(십진수 : " + v1 + ")");
		//toBinaryString은 아래쪽에 사용자가 만든 메소드를 활용하여 2진 출력
		System.out.println(toBinaryString(v2) + "(십진수 : " + v2 + ")");
		System.out.println(toBinaryString(v3) + "(십진수 : " + v3 + ")");
		
		System.out.println("--------------------------------");
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;

		System.out.println(toBinaryString(v4) + "(십진수 : " + v4 + ")");
		System.out.println(toBinaryString(v5) + "(십진수 : " + v5 + ")");
		System.out.println(toBinaryString(v6) + "(십진수 : " + v6 + ")");
	}

	public static String toBinaryString(int value) {	
		//9줄에 있는 v1값을 입력 받아 2진 32개의 숫자롤 출력하기 위한 메소드
		String str = Integer.toBinaryString(value);		//정수를 2진으로 return하는 메소드
		while(str.length() < 32 ) {	//str에 글자 길이가 32이하 인지를 반복
			str = "0" + str; //32글자 이하일 때 글자 앞에 0을 붙이는 수식
		}
		return str; //결과값을 반환
		
		
	}

}
