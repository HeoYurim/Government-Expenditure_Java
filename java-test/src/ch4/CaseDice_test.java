package ch4;

public class CaseDice_test {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 6) + 1;
		
		System.out.println("주사위 값은 -> " + num);
		
		switch(num) {
		case '1':
			System.out.println("1번이라네");
		case '2':
			System.out.println("2번이라네");
		case '3':
			System.out.println("3번이라네");
		case '4':
			System.out.println("4번이라네");
		case '5':
			System.out.println("5번이라네");
		case '6':
			System.out.println("6번이라네");

		}
		
	}

}
