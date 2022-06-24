package ch1;

public class VariableEx_test {

	public static void main(String[] args) {

		int mach = 340;
		int distance = mach * 60 * 60;
		
		System.out.println("소리가 1시간동안 가는 거리 : " + distance + "m");
		
		System.out.println("-----------------------------");
				
		int radius = 10;
		double area;	
		area = radius * radius * 3.14;
		
		System.out.println("반지름의 길이가 " + radius + "인 원의 넓이는 = " + area);
		
		System.out.println("-----------------------------");
		
		char firstName = '허';
		char midName = '유';
		char lastName = '림';
		
	//	System.out.print(firstName + midName + lastName); -> 더하기 쓰면 이름이 아니라 숫자가 나옴
		System.out.print(firstName);
		System.out.print(midName);
		System.out.print(lastName);
	}

}
