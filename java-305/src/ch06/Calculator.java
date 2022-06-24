package ch06;

public class Calculator { //°è»ê±â ÇÁ·Î±×·¥
	
	//¸Ş¼Òµå
	void powerOn() {
		System.out.println("°è»ê±âÀÇ Àü¿øÀ» ÄÕ´Ï´Ù.");
	}
	
	int plus(int x, int y) { //µ¡¼À
		int result = x + y;
		return result;
	}
	int minus(int x, int y) { //»¬¼À
		int result = x - y;
		return result;
	}
	int multiply(int x, int y) { //°ö¼À
		int result = x * y;
		return result;
	}
	double divide(int x, int y) { //³ª´°¼À
		double result = (double)x /(double) y;
		return result;
	} 
	int reminder(int x, int y) { //³ª¸ÓÁö
		int result = x % y;
		return result;
	}
	
	void powerOff() {
		System.out.println("°è»ê±âÀÇ Àü¿øÀ» ²ü´Ï´Ù.");
	}
}
