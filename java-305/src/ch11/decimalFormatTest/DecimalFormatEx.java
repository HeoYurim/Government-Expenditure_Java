package ch11.decimalFormatTest;

import java.text.*;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		double num1 = 1234567;
		
		//소수점 없이 반올림 진행
		DecimalFormat df = new DecimalFormat("0");	
		System.out.println(df.format(num));
		
		//소수점 1자리 반올림을 진행
		df = new DecimalFormat("0.0");	
		System.out.println(df.format(num));
		
		//빈자리는 0으로 채운다
		df = new DecimalFormat("0000000000.00000");	
		System.out.println(df.format(num));
		
		//소수점 없이 반올림을 진행
		df = new DecimalFormat("#");	
		System.out.println(df.format(num));
		
		//소수점 1자리 반올림 진행
		df = new DecimalFormat("#.#");	
		System.out.println(df.format(num));
		
		//자리 수를 만들어 놓긴 하는데 없으면 생략
		df = new DecimalFormat("########.#####");	
		System.out.println(df.format(num));
		
		//정수부분은 모든 값을 출력 소수 부분은 1자리 생성(반올림)
		df = new DecimalFormat("#.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//정수부분은 모든 값을 출력 소수 부분은 1자리 생성(반올림)
		df = new DecimalFormat("+#.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//정수부분은 모든 값을 출력 소수 부분은 1자리 생성(반올림)
		df = new DecimalFormat("-#.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//정수부분은 모든 값을 출력 소수 부분은 1자리 생성(반올림)
		df = new DecimalFormat("#,###.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		//백분율을 곱하기 100을 한 후에 %를 출력
		df = new DecimalFormat("#,###.0 %");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
		
		df = new DecimalFormat("\u00A4 #,###.0");	
		System.out.println(df.format(num));
		System.out.println(df.format(num1));
	}

}
