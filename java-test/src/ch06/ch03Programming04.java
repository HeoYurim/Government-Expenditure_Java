package ch06;

public class ch03Programming04 {
	public static void main(String[] args) {
		for(int i =1; i<6; i++) { //전체 5바퀴
			for(int j=0; j<i; j++) { //별 개수
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

