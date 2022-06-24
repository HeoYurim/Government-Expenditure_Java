package ch05;

public class MuiltArrayEx {

	public static void main(String[] args) {
		
		int[][] scores = new int[2][];
		scores[0] = new int[2]; //0행에 해당하는 2개의 열을 생성
		scores[1] = new int[3]; //1행에 해당하는 3개의 열을 생성
		
		System.out.println("행의 개수를 확인 : " + scores.length);
		System.out.println("0열의 개수를 확인 : " + scores[0].length);
		System.out.println("1열의 개수를 확인 : " + scores[1].length);
		
		/*
		int[][] scores = new int[2][3];	//2행 3열 2차원 배열 생성
		
		System.out.println("행의 개수를 확인 : " + scores.length);
		System.out.println("0열의 개수를 확인 : " + scores[0].length);
		System.out.println("1열의 개수를 확인 : " + scores[1].length);
		 */
	}

}
