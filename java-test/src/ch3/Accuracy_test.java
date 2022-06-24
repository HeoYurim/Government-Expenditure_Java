package ch3;

public class Accuracy_test {

	public static void main(String[] args) {
		
		//사과 1개에서 0.7조각을 빼면 몇 조각이 남는가
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		int temp = totalPiece - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한 개에서 0.7조각을 빼면 " + result + " 조각이 남는다.");
		
	}

}
