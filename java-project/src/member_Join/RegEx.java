package member_Join;

import java.util.Scanner;

public class RegEx {

	public static void main(String[] args) {
		
		boolean run = true;
		int againnumber = 0;
		
		Reg reg = new Reg();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----ȸ�� ����----");
		System.out.print("�̸� : ");
		reg.name = scan.nextLine();

		System.out.print("��ȭ��ȣ(010-****-****) : ");
		reg.number = scan.nextLine();

		System.out.print("�ֹι�ȣ(******-*******) : ");
		reg.ssn = scan.nextLine();

		System.out.print("����(����/����) : ");
		reg.manwoman = scan.nextLine();

		System.out.print("���̵� : ");
		reg.id = scan.nextLine();

		System.out.print("��й�ȣ : ");
		reg.password = scan.nextInt();
		
		System.out.println();
		System.out.print("ȸ�������� Ȯ���� ���Ͻø� ��й�ȣ�� �Է����ּ��� => ");
		againnumber = scan.nextInt();
		if(reg.password == againnumber) {
			System.out.println("--�Է� ����--");
			System.out.println("�̸� : " + reg.name);
			System.out.println("��ȭ��ȣ : " + reg.number);
			System.out.println("�ֹι�ȣ : " + reg.ssn);
			System.out.println("���� : " + reg.manwoman);
			System.out.println("���̵� : " + reg.id);
			System.out.println("��й�ȣ : " + reg.password);
		}else {
			while(run) {
				System.out.println("��й�ȣ�� �ٸ��ϴ�.");
				System.out.print("�ٽ� �Է����ּ��� => ");
				int againnumber1 = scan.nextInt();
				if(reg.password == againnumber1) {
					System.out.println("--�Է� ����--");
					System.out.println("�̸� : " + reg.name);
					System.out.println("��ȭ��ȣ : " + reg.number);
					System.out.println("�ֹι�ȣ : " + reg.ssn);
					System.out.println("���� : " + reg.manwoman);
					System.out.println("���̵� : " + reg.id);
					System.out.println("��й�ȣ : " + reg.password);
					
					run = false;
					System.out.println("Ȯ�����ּ���!");
				}

			}
			
		}
		

	}

}
