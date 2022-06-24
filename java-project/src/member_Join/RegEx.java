package member_Join;

import java.util.Scanner;

public class RegEx {

	public static void main(String[] args) {
		
		boolean run = true;
		int againnumber = 0;
		
		Reg reg = new Reg();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----회원 가입----");
		System.out.print("이름 : ");
		reg.name = scan.nextLine();

		System.out.print("전화번호(010-****-****) : ");
		reg.number = scan.nextLine();

		System.out.print("주민번호(******-*******) : ");
		reg.ssn = scan.nextLine();

		System.out.print("성별(남자/여자) : ");
		reg.manwoman = scan.nextLine();

		System.out.print("아이디 : ");
		reg.id = scan.nextLine();

		System.out.print("비밀번호 : ");
		reg.password = scan.nextInt();
		
		System.out.println();
		System.out.print("회원정보를 확인을 원하시면 비밀번호를 입력해주세요 => ");
		againnumber = scan.nextInt();
		if(reg.password == againnumber) {
			System.out.println("--입력 정보--");
			System.out.println("이름 : " + reg.name);
			System.out.println("전화번호 : " + reg.number);
			System.out.println("주민번호 : " + reg.ssn);
			System.out.println("성별 : " + reg.manwoman);
			System.out.println("아이디 : " + reg.id);
			System.out.println("비밀번호 : " + reg.password);
		}else {
			while(run) {
				System.out.println("비밀번호가 다릅니다.");
				System.out.print("다시 입력해주세요 => ");
				int againnumber1 = scan.nextInt();
				if(reg.password == againnumber1) {
					System.out.println("--입력 정보--");
					System.out.println("이름 : " + reg.name);
					System.out.println("전화번호 : " + reg.number);
					System.out.println("주민번호 : " + reg.ssn);
					System.out.println("성별 : " + reg.manwoman);
					System.out.println("아이디 : " + reg.id);
					System.out.println("비밀번호 : " + reg.password);
					
					run = false;
					System.out.println("확인해주세요!");
				}

			}
			
		}
		

	}

}
