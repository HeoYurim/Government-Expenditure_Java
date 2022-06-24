package ch2;

public class CastingEx_test {

	public static void main(String[] args) {

		//int 값을 byte로
		int price = 100;
		byte bytePrice = (byte)price;
		
		System.out.println(price);
		System.out.println(bytePrice);
		
		System.out.println("----------------");
		
		//int 값을 char로
		int secondPrice = 45000;
		char charSecondPrice = (char)secondPrice;
		
		System.out.println(secondPrice);
		System.out.println(charSecondPrice);
		
		System.out.println("----------------");
		
		//double값을 int로
		double lastPrice = 3.14;
		int intLastPrice = (int)lastPrice;
		
		System.out.println(lastPrice);
		System.out.println(intLastPrice);

	}

}
