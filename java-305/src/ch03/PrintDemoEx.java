package ch03;

public class PrintDemoEx {

	public static void main(String[] args) {

		int i = 97;
		String s = "Java";
		double f = 3.14f;
		
		System.out.printf("%d\n" , i);		// 97의 값
		System.out.printf("%o\n" , i);		// 8진수 값
		System.out.printf("%x\n" , i);		// 16진수 값
		System.out.printf("%c\n" , i);		// char 값
		System.out.printf("%5d\n" , i);		// 5칸 채우기인데 숫자가 뒤에 맞춰져서 앞에는 빈 공간으로 나옴
		System.out.printf("%05d\n" , i);	// 빈 공간을 0으로 채움
		System.out.printf("%s\n" , s);		// String 값
		System.out.printf("%5s\n" , s);		// 5칸에 string 값 채움, 없는 곳은 빈칸
		System.out.printf("%-5s\n" , s);	// -는 왼쪽부터 나옴, 맨뒤에 빈칸
		System.out.printf("%f\n" , f);		// double 값(10진수 실수)
		System.out.printf("%e\n" , f);		// 지수
		System.out.printf("%4.1f\n" , f);	// 4자리, 소수점 이하 1자리, 앞에 없는 곳 빈칸
		System.out.printf("%04.1f\n" , f);	// 4자리, 소수점 이하 1자리, 빈칸 0
		System.out.printf("%-4.1f\n" , f);	// 4자리, 소수점 이하 1자리, 왼쪽 정렬
		
	}

}
