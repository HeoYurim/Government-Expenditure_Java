package ch06.exam15.login_logout;

import java.util.*;

public class MemberServiceEx {

	public static void main(String[] args) {

		MemberService memberservice = new MemberService();
		
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		do {	
			System.out.print("���̵� �Է��ϼ��� : ");
			String id = scan.nextLine();
			
			System.out.print("���̵� �Է��ϼ��� : ");
			String password = scan.nextLine();
			
			boolean result = memberservice.login(id, password);
			
			if(result) {
				System.out.println("�α����� �Ǿ����ϴ�.");
				System.out.println("��� �� �α׾ƿ� �ϰڽ��ϴ�.");
				System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
				
				run = false;
			}else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}while(run);
	}

}
