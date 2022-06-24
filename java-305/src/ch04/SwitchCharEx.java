package ch04;

public class SwitchCharEx {

	public static void main(String[] args) {

		char grade = 'G';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원 입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원 입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			System.out.println("회원가입을 하시겠습니까?");
		}
	}

}
