package ch05;

public class ArrayinArrayEx {

	public static void main(String[] args) {

	//	int[][] mathScores = new int [2][3];
		
		int[][] mathScores = {{60,70,80},{70,80,90}};

		
		for(int i = 0; i < mathScores.length; i++) { //0~1까지 2개 반복	
			for(int k = 0; k < mathScores[i].length; k++) { //0~2까지 3개 반복
				System.out.println("matchScores[" + i + "][" + k +"]" + mathScores[i][k]); //2행 3열의 값을 출력하는 문구			
			}
		}
		
		System.out.println("======================");
		
		for(int i = 0; i < mathScores.length; i++) { //0~1까지 2개 반복	
			for(int k = 0; k < mathScores[i].length; k++) { //0~2까지 3개 반복
				System.out.print(mathScores[i][k] + " "); //2행 3열의 값을 출력하는 문구
			}
			System.out.println();
		}
		
		System.out.println("======================");

//		int[][] englishScores = new int[2][];	//계단식 행렬 구현
//		englishScores[0] = new int[2]; 	//0행에 2개의 열을 구현 
//		englishScores[1] = new int[3]; 	//1행에 3개의 열을 구현 

		int[][] englishScores = {{55, 42, 92, 41},{33, 11, 20},{74, 43},{100,07, 97}};
		
		for(int i = 0; i < englishScores.length; i++) { 
			for(int k = 0; k < englishScores[i].length; k++) { 
				System.out.println("englishScores[" + i + "][" + k +"]" + englishScores[i][k]); 
			}
		}
		
		System.out.println("======================");
		
		for(int i = 0; i < englishScores.length; i++) { 
			for(int k = 0; k < englishScores[i].length; k++) { 
				System.out.print(englishScores[i][k] + " "); 
			}
			System.out.println();
		}
		
		System.out.println("======================");

	}
}
