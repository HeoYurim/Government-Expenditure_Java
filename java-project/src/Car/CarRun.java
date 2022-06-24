package Car;

import java.util.Scanner;

public class CarRun {
	int gas = 10;
	String answer;
	
	
	void plusGas() {
		System.out.println("가까운 주유소로 안내합니다.");
		System.out.print("얼마나 더 충전하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		int plusgas = scan.nextInt();
		gas += plusgas;		
		System.out.println("충전을 완료했습니다. \n다시 주행합니다.");
		System.out.println("---------------");
		runCheck();
		run();
		
	}
	
	
	void runCheck() {
			if(gas == 0) {
				System.out.println("휘발유가 없습니다.");
				System.out.println("멈춥니다. gas 잔량 : (" + gas +  ")");
				return;
			}else if(gas <= 3) {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("휘발유가 얼마 남지 않았습니다.");
				System.out.println("주유소로 가시겠습니까?");
				Scanner scan = new Scanner(System.in);
				answer = scan.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					plusGas();
				} else if ((answer.equalsIgnoreCase("N"))) {
					run();
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				}
			}else {
				System.out.println("휘발유가 충분합니다.");
				System.out.println("앞으로 남은 휘발유는 " + gas + "입니다.");
			}	
		}
	
	void run() {
		System.out.println("출발합니다.");
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량: " + gas + " )");
				gas--;
				
				if(gas <= 3) {
				System.out.println("잠시 멈추겠습니다. (gas잔량: " + gas + " )");
				runCheck();
				break;
			}
			
			}else {
				System.out.println("멈춥니다. (gas잔량: " + gas + " )");
				return;
			}
		}
	}
}
