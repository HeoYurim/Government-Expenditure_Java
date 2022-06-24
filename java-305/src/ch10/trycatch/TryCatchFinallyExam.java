package ch10.trycatch;

public class TryCatchFinallyExam {

	public static void main(String[] args) {

		try { //args에 값이 2개인지를 확인하는 예외코드
			String data1 = null;
			String data2 = null;
			data1 = args[0];
			data2 = args[1];
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);	

		}catch(ArrayIndexOutOfBoundsException  | NumberFormatException e) { //예외 발생시 출력문
				System.out.println("실행 매개값이 부족하거나 매개값이 정수가 아닙니다..");
				System.out.println("args에 2개 정수값을 넣어주세요.");
						
		}catch(Exception e) { //예외 상위 클래스 (퉁 치는 역할!)
			System.out.println("예외 발생 프로그래머에게 문의하세요");
			
		}finally {
			System.out.println("다시 실행하세요.");
		}
		
		/*
		try { //args에 값이 2개인지를 확인하는 예외코드
			String data1 = null;
			String data2 = null;
			data1 = args[0];
			data2 = args[1];
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);	

		}catch(ArrayIndexOutOfBoundsException e) { //예외 발생시 출력문
				System.out.println("실행 매개값이 부족합니다.");
				System.out.println("args에 2개 값을 넣어주세요.");
						
		}catch(Exception e) { //예외 상위 클래스 (퉁 치는 역할!)
			System.out.println("예외 발생 프로그래머에게 문의하세요");
			
		}finally {
			System.out.println("다시 실행하세요.");
		}
		*/
		
		/*
		String data1 = null;
		String data2 = null;
		
		try { //args에 값이 2개인지를 확인하는 예외코드
			data1 = args[0];
			data2 = args[1];
			
		}catch(ArrayIndexOutOfBoundsException e) { //예외 발생시 출력문
			System.out.println("실행 매개값이 부족합니다.");
			System.out.println("args에 2개 값을 넣어주세요.");
			return;
		}
		
		try { //args에 입력 값이 정수로 변환되는 예외 코드
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
		}catch(NumberFormatException e) { //예외 발생시 출력문
			System.out.println("숫자로 변환할 수 없는 args 값입니다..");
			System.out.println("숫자로 다시 입력하세요..");
		}finally {
			System.out.println("다시 실행하세요.");
		}
		*/
	}
	
}
