package ch04;

import java.util.Scanner;

public class Switch2Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("����,������ �Է��ϼ��� : ");
		String name = scan.nextLine();
		whoIsIt(name);
		
		/*
		whoISIt("ȣ����"); //���� ���� �Լ�(�޼���)�� ȣ���� ���� �ִ´�.
		whoISIt("����");
		whoISIt("����");
		whoISIt("������");*/
		
	}//main �޼����� ���� ��ȣ

	static void whoIsIt(String bio) {

		String kind ="������ ����";
		switch(bio) {
		case "ȣ����","����","������","�����" -> kind ="������";
			
		case "������","����","���","��ѱ�" ->kind ="����";
			
		case "����","����","��ġ","��ġ" ->kind ="���";
			
		default-> System.out.println("������");
		}
		System.out.printf("%s�� %s�̴�.\n", bio, kind);
		
		/*
		String kind ="";
		switch(bio) {
		case "ȣ����":
		case "����":
		case "������":
		case "�����":
			kind ="������";
			break;
		case "������":
		case "����":
		case "���":
		case "��ѱ�":
			kind ="����";
			break;
		case "����":
		case "����":
		case "��ġ":
		case "��ġ":
			kind ="���";
			break;
		default:
			System.out.println("������");
			kind ="�ٽ� �Է��ϼ���";
		}
		System.out.printf("%s�� %s�̴�.\n", bio, kind);
		*/
	}

}
