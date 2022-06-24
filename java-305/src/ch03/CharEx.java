package ch03;

public class CharEx {

	public static void main(String[] args) {

		char c1 = 'A' + 1; //65 + 1 -> char타입으로 넘어간다. -> B
		char c2 = 'A'; //65 -> char타입으로 c2로 생성
		
	//	char c3 = c2 + 1; //c2가 char 타입으로 1을 더하려고 했는데 int로 계산
		char c3 = (char)(c2 + 1);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
	}

}
