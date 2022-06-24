package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach; //정수 타입의 mach변수를 선언
		int distance; //정수 타입의 distance 변수 선언
		
		mach = 340;
		distance = mach * 60 * 60; //음속을 m/s로 계산
		System.out.println("소리가 1시간동안 가는 거리 : "  +distance + "m");
		
		double radius; // 실수 타입의 radius 변수를 선언
		double area; //실수 타입의 area 타입
		radius = 10; //실수 값을 입역
		area = radius * radius * 3.14;
		System.out.println("반지름이 "+ radius + "인 원의 넓이는 " + area);
		
		char firstName; //문자타입의 firstName 변수 생성
		char midName;
		char lastName;
		firstName = '허'; //firstName에 문자 입력
		midName = '유';
		lastName = '림';
		
		System.out.print(firstName); //firstName에 문자 출력(개행 없음)
		System.out.print(midName);
		System.out.print(lastName);
		
		/* System.out.println(firstName + midName + lastName); //더하기 쓰면 안됨*/
		//println은 enter 효과가 있고 print은 옆에 바로 옴
	}

}
