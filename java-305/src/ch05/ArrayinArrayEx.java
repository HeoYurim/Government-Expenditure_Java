package ch05;

public class ArrayinArrayEx {

	public static void main(String[] args) {

	//	int[][] mathScores = new int [2][3];
		
		int[][] mathScores = {{60,70,80},{70,80,90}};

		
		for(int i = 0; i < mathScores.length; i++) { //0~1���� 2�� �ݺ�	
			for(int k = 0; k < mathScores[i].length; k++) { //0~2���� 3�� �ݺ�
				System.out.println("matchScores[" + i + "][" + k +"]" + mathScores[i][k]); //2�� 3���� ���� ����ϴ� ����			
			}
		}
		
		System.out.println("======================");
		
		for(int i = 0; i < mathScores.length; i++) { //0~1���� 2�� �ݺ�	
			for(int k = 0; k < mathScores[i].length; k++) { //0~2���� 3�� �ݺ�
				System.out.print(mathScores[i][k] + " "); //2�� 3���� ���� ����ϴ� ����
			}
			System.out.println();
		}
		
		System.out.println("======================");

//		int[][] englishScores = new int[2][];	//��ܽ� ��� ����
//		englishScores[0] = new int[2]; 	//0�࿡ 2���� ���� ���� 
//		englishScores[1] = new int[3]; 	//1�࿡ 3���� ���� ���� 

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
