package ch04;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) throws Exception {

		// ����
		Scanner scan = new Scanner(System.in);
		String drink1 = "���̽� �Ƹ޸�ī��", drink2 = "������ ���߰�", drink3 = "����Ƽ";
		int price1 = 3500, price2 = 5500, price3 = 5000;

		int money = 0; // ��ü �ݾ�
		int sel = -1; // �޴� ���� ����
		boolean run = true; // ���Ǳ� ������
		String position;

		System.out.println("�ȳ��ϼ��� YR ���Ǳ��Դϴ�.");
		System.out.println("�մ��̽Ű���? �ƴϸ� �����̽Ű���?");

		position = scan.nextLine();

		Outter:switch (position) {
		case "�մ�":
			
			while (run) {
				System.out.println("***********| MENU |***********");
				System.out.println("| 0.�������� |");
				System.out.println("| 1.�޴����� |");
				System.out.println("| 99.�Ž����� ��ȯ |");
				System.out.println("******************************");
				System.out.println("| 100.����|");
				System.out.println("******************************");
				System.out.println();
				
				System.out.print("��ư�� �����ϼ��� ~> ");
				sel = scan.nextInt();
				System.out.println("���� �ݾ� : " + money);
				System.out.println("------------------------------");

				switch (sel) {
				case 0:
					System.out.print("������ ���� : ");
					money += scan.nextInt();
					System.out.println("���� �ݾ� : " + money);
					break;

				case 1:
					System.out.println("1.���̽� �Ƹ޸�ī��(3500)\n2.������ ���߰�(5500)\n3.����Ƽ(5000)\n4.����");
					
					System.out.print("�޴��� �������ּ��� : ");
					int menuNum = scan.nextInt();
					System.out.println("------------------------------");

					switch (menuNum) {
					case 1:
						if (money > price1) {
							System.out.println("���̽� �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.");
							System.out.println("������ 3500���Դϴ�.");
							money = money -= price1;
							System.out.println("���� �ݾ��� " + money + "���Դϴ�.");
							System.out.println("------------------------------");
						} else {
							System.out.println("���� �����մϴ�.");
							System.out.println("���� �߰��� ������ �ֽðų� ���Ǳ⸦ ������ �ּ���.");
							System.out.println("------------------------------");

						}
						break;

					case 2:
						if (money > price2) {
							System.out.println("������ ���߰��� �����ϼ̽��ϴ�.");
							System.out.println("������ 5500���Դϴ�.");
							money = money -= price2;
							System.out.println("���� �ݾ��� " + money + "���Դϴ�.");
							System.out.println("------------------------------");
						} else {
							System.out.println("���� �����մϴ�.");
							System.out.println("���� �߰��� ������ �ֽðų� ���Ǳ⸦ ������ �ּ���.");
							System.out.println("------------------------------");

						}
						break;
					case 3:
						if (money > price3) {
							System.out.println("����Ƽ�� �����ϼ̽��ϴ�.");
							System.out.println("������ 5000���Դϴ�.");
							money = money -= price3;
							System.out.println("���� �ݾ��� " + money + "���Դϴ�.");
							System.out.println("------------------------------");
						} else {
							System.out.println("���� �����մϴ�.");
							System.out.println("���� �߰��� ������ �ֽðų� ���Ǳ⸦ ������ �ּ���.");
							System.out.println("------------------------------");
						}
						break;
					case 4:
						System.out.println("������ �����ϼ̽��ϴ�.");
						int random = (int) (Math.random() * 3) + 1;

						if (random == 1) {
							if (money > price1) {
								System.out.println("���̽� �Ƹ޸�ī�밡 ���õǾ����ϴ�.");
								System.out.println("������ 3500���Դϴ�.");
								money = money -= price1;
								System.out.println("���� �ݾ��� " + money + "���Դϴ�.");
								System.out.println("------------------------------");
							} else {
								System.out.println("���� �����մϴ�.");
								System.out.println("���� �߰��� ������ �ֽðų� ���Ǳ⸦ ������ �ּ���.");
								System.out.println("------------------------------");
							}
							break;
						} else if (random == 2) {
							if (money > price2) {
								System.out.println("������ ���߰��� ���õǾ����ϴ�.");
								System.out.println("������ 5500���Դϴ�.");
								money = money -= price2;
								System.out.println("���� �ݾ��� " + money + "���Դϴ�.");
								System.out.println("------------------------------");
							} else {
								System.out.println("���� �����մϴ�.");
								System.out.println("���� �߰��� ������ �ֽðų� ���Ǳ⸦ ������ �ּ���.");
								System.out.println("------------------------------");
							}
							break;
						} else if (random == 3) {
							if (money > price2) {
								System.out.println("����Ƽ�� ���õǾ����ϴ�.");
								System.out.println("������ 5000���Դϴ�.");
								money = money -= price3;
								System.out.println("���� �ݾ��� " + money + "���Դϴ�.");
								System.out.println("------------------------------");
							} else {
								System.out.println("���� �����մϴ�.");
								System.out.println("���� �߰��� ������ �ֽðų� ���Ǳ⸦ ������ �ּ���.");
								System.out.println("------------------------------");
							}
							break;
						}
					case 5:
						System.out.println("�޴� ��ȣ�� �ƴմϴ�.");
						break;
					}
					break;

				case 99:
					System.out.println("�Ž����� ��ȯ�� �����ϼ̽��ϴ�.");
					System.out.println("> ���� �ݾ� : " + money);
					money = money - money;
					System.out.println("> ��ȯ �� ���� �ݾ� : " + money);
					System.out.println("��ȯ�Ǿ����ϴ�.");
					break;

				case 100:
					System.out.println("����");
					run = false;
					break Outter;
				default:
					System.out.println("�ٽ� �����ּ���!");
				}
			}

		case "����":
			System.out.println("��ũ�� : Admin mode (������/�������/���ݰ��� ��)");
		default:
			System.out.println("����");
			break;
		}
	}

}
