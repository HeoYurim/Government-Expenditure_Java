package ch15.hashTable;

import java.util.*;

public class HashTableEx {

	public static void main(String[] args) {
		//로그인 시도하는 예제문
		Map<String, String> map =  new HashMap<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345"); //id 암호 검증
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {//아이디와 비번 일치 여부를 판단
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
		}
		
	}

}