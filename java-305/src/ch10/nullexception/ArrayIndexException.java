package ch10.nullexception;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		//args 값이 2개일 경우
		if(args.length == 2) {	
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]" + data1);
			System.out.println("args[1]" + data2);
			
		}else { //false일 때 출력문
			System.out.println("입력값이 잘못 되었습니다.");
			System.out.println("args에 값 2개를 입력하세요.");
		}
	}
}

