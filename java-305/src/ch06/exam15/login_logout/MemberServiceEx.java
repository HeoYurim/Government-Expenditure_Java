package ch06.exam15.login_logout;

import java.util.*;

public class MemberServiceEx {

	public static void main(String[] args) {

		MemberService memberservice = new MemberService();
		
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		do {	
			System.out.print("아이디를 입력하세요 : ");
			String id = scan.nextLine();
			
			System.out.print("아이디를 입력하세요 : ");
			String password = scan.nextLine();
			
			boolean result = memberservice.login(id, password);
			
			if(result) {
				System.out.println("로그인이 되었습니다.");
				System.out.println("잠시 후 로그아웃 하겠습니다.");
				System.out.println(id + "님이 로그아웃 되었습니다.");
				
				run = false;
			}else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}while(run);
	}

}
