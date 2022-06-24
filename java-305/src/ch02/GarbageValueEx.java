package ch02;

public class GarbageValueEx {

	public static void main(String[] args) {

		byte var1 = -125;
		int var2 = -125;
		
		for(int i = 0; i < 5; i++) { //변수 i를 0부터 5까지 1씩 증가하는 반복문
			var1--; //var1 = var1  + 1; -> byte 125를 1씩 증가
			var2--; //var2 = var2 + 1; -> int 125를 1씩 증가
			
			System.out.println("var1 : " + var1 + "          var2 : " + var2);
		}
		
	}

}

/* package ch02;

public class GarbageValueEx {

	public static void main(String[] args) {

		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0; i < 5; i++) { //변수 i를 0부터 5까지 1씩 증가하는 반복문
			var1++; //var1 = var1  + 1; -> byte 125를 1씩 증가
			var2++; //var2 = var2 + 1; -> int 125를 1씩 증가
			
			System.out.println("var1 : " + var1 + "          var2 : " + var2);
		}
		
	}

}*/
