package HotelBook;

import java.util.Scanner;

public class HotelBook {

	int[] room = new int[12];
	int leftroom;
	
	void menu() {
		System.out.println("안녕하세요 YR호텔입니다.");
		while(true) {
			System.out.println("-------메뉴-------");
			System.out.println("1. 예약하기 | 2. 예약 취소 | 3. 호실 보기 | 99. 종료");
			Scanner scan = new Scanner(System.in);
			int selectNum = scan.nextInt();
			if(selectNum == 1) {
				book();
				break;
			}else if(selectNum == 2) {
				bookcancel();
				break;
			}else if(selectNum == 3) {
				roomCheck();
				break;
			}else if(selectNum == 99) {
				System.out.println("종료합니다.");
				return;
			}else {
				System.out.println("다시 선택해주세요");
				return;
			}
		}
		
	}
	
	void book() {
		System.out.println("몇 호실을 예약하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		int roomnNum = scan.nextInt();
	
		roomCheck();
	
		if(leftroom == 1) {
			System.out.println("예약해드리겠습니다.");
			//회원가입 넣어도 좋을 듯
			menu();
		}else if(leftroom == 2) {
			System.out.println("죄송합니다, 현재 예약완료 객실입니다.");
			book();
		}
	}
	
	void bookcancel() {
		
	}
	
	void roomCheck() {
		
	}
	
	

}
