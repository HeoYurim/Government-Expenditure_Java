package ch05;

public class ArrayCopyEx {

	public static void main(String[] args) {

		int[] oldIntArray = {1,2,3}; //3칸짜리 기존 배열 생성
		int[] newIntArray = new int[5]; //5칸짜리 새로운 배열 생성
		
		for(int i = 0; i <oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; //기존 배열 i값을 신규배열 i값에 넣는다.
		}
		
		for(int x = 0; x <oldIntArray.length; x++) { //y가 0부터 newIntArray 값만큼 반복
			System.out.print(oldIntArray[x] + " ");
		}
		System.out.println();
		for(int j = 0; j <newIntArray.length; j++) { //y가 0부터 newIntArray 값만큼 반복
			System.out.print(newIntArray[j] + " ");
		}
	}

}
