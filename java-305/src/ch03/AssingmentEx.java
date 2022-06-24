package ch03;

public class AssingmentEx {

	public static void main(String[] args) {
		
		int result = 0;
		result += 10;	//result = result + 10
		System.out.println("+= result : " + result	);	//10
		
		result -= 5;	//result = 10 - 5
		System.out.println("-= result : " + result	);	//5
		
		result *= 3;	//result = 5 * 3
		System.out.println("*= result : " + result	);	//15
		
		result /= 5;	//result = 15 / 5
		System.out.println("/= result : " + result	);	//3
		
		result %= 3;	//result = 3 % 3 -> ³ª¸ÓÁö 0
		System.out.println("%= result : " + result	);	//0

	}

}
