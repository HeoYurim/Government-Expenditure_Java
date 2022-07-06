package ch04;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) throws Exception {

		// 선언
		Scanner scan = new Scanner(System.in);
		String drink1 = "아이스 아메리카노", drink2 = "녹차라떼 샷추가", drink3 = "버블티";
		int price1 = 3500, price2 = 5500, price3 = 5000;

		int money = 0; // 전체 금액
		int sel = -1; // 메뉴 선택 변수
		boolean run = true; // 자판기 동작중
		String position;

		System.out.println("안녕하세요 YR 자판기입니다.");
		System.out.println("손님이신가요? 아니면 직원이신가요?");

		position = scan.nextLine();

		Outter:switch (position) {
		case "손님":
			
			while (run) {
				System.out.println("***********| MENU |***********");
				System.out.println("| 0.동전투입 |");
				System.out.println("| 1.메뉴선택 |");
				System.out.println("| 99.거스름돈 반환 |");
				System.out.println("******************************");
				System.out.println("| 100.종료|");
				System.out.println("******************************");
				System.out.println();
				
				System.out.print("버튼을 선택하세요 ~> ");
				sel = scan.nextInt();
				System.out.println("현재 금액 : " + money);
				System.out.println("------------------------------");

				switch (sel) {
				case 0:
					System.out.print("투입할 동전 : ");
					money += scan.nextInt();
					System.out.println("현재 금액 : " + money);
					break;

				case 1:
					System.out.println("1.아이스 아메리카노(3500)\n2.녹차라떼 샷추가(5500)\n3.버블티(5000)\n4.랜덤");
					
					System.out.print("메뉴를 선택해주세요 : ");
					int menuNum = scan.nextInt();
					System.out.println("------------------------------");

					switch (menuNum) {
					case 1:
						if (money > price1) {
							System.out.println("아이스 아메리카노를 선택하셨습니다.");
							System.out.println("가격은 3500원입니다.");
							money = money -= price1;
							System.out.println("남은 금액은 " + money + "원입니다.");
							System.out.println("------------------------------");
						} else {
							System.out.println("돈이 부족합니다.");
							System.out.println("돈을 추가로 투입해 주시거나 자판기를 종료해 주세요.");
							System.out.println("------------------------------");

						}
						break;

					case 2:
						if (money > price2) {
							System.out.println("녹차라떼 샷추가를 선택하셨습니다.");
							System.out.println("가격은 5500원입니다.");
							money = money -= price2;
							System.out.println("남은 금액은 " + money + "원입니다.");
							System.out.println("------------------------------");
						} else {
							System.out.println("돈이 부족합니다.");
							System.out.println("돈을 추가로 투입해 주시거나 자판기를 종료해 주세요.");
							System.out.println("------------------------------");

						}
						break;
					case 3:
						if (money > price3) {
							System.out.println("버블티를 선택하셨습니다.");
							System.out.println("가격은 5000원입니다.");
							money = money -= price3;
							System.out.println("남은 금액은 " + money + "원입니다.");
							System.out.println("------------------------------");
						} else {
							System.out.println("돈이 부족합니다.");
							System.out.println("돈을 추가로 투입해 주시거나 자판기를 종료해 주세요.");
							System.out.println("------------------------------");
						}
						break;
					case 4:
						System.out.println("랜덤를 선택하셨습니다.");
						int random = (int) (Math.random() * 3) + 1;

						if (random == 1) {
							if (money > price1) {
								System.out.println("아이스 아메리카노가 선택되었습니다.");
								System.out.println("가격은 3500원입니다.");
								money = money -= price1;
								System.out.println("남은 금액은 " + money + "원입니다.");
								System.out.println("------------------------------");
							} else {
								System.out.println("돈이 부족합니다.");
								System.out.println("돈을 추가로 투입해 주시거나 자판기를 종료해 주세요.");
								System.out.println("------------------------------");
							}
							break;
						} else if (random == 2) {
							if (money > price2) {
								System.out.println("녹차라떼 샷추가가 선택되었습니다.");
								System.out.println("가격은 5500원입니다.");
								money = money -= price2;
								System.out.println("남은 금액은 " + money + "원입니다.");
								System.out.println("------------------------------");
							} else {
								System.out.println("돈이 부족합니다.");
								System.out.println("돈을 추가로 투입해 주시거나 자판기를 종료해 주세요.");
								System.out.println("------------------------------");
							}
							break;
						} else if (random == 3) {
							if (money > price2) {
								System.out.println("버블티가 선택되었습니다.");
								System.out.println("가격은 5000원입니다.");
								money = money -= price3;
								System.out.println("남은 금액은 " + money + "원입니다.");
								System.out.println("------------------------------");
							} else {
								System.out.println("돈이 부족합니다.");
								System.out.println("돈을 추가로 투입해 주시거나 자판기를 종료해 주세요.");
								System.out.println("------------------------------");
							}
							break;
						}
					case 5:
						System.out.println("메뉴 번호가 아닙니다.");
						break;
					}
					break;

				case 99:
					System.out.println("거스름돈 반환을 선택하셨습니다.");
					System.out.println("> 남은 금액 : " + money);
					money = money - money;
					System.out.println("> 반환 후 남은 금액 : " + money);
					System.out.println("반환되었습니다.");
					break;

				case 100:
					System.out.println("종료");
					run = false;
					break Outter;
				default:
					System.out.println("다시 눌러주세요!");
				}
			}

		case "직원":
			System.out.println("스크릿 : Admin mode (재고관리/음료관리/가격관리 등)");
		default:
			System.out.println("종료");
			break;
		}
	}

}
