package ch02;

public class GarbageValueEx {

	public static void main(String[] args) {

		byte var1 = -125;
		int var2 = -125;
		
		for(int i = 0; i < 5; i++) { //���� i�� 0���� 5���� 1�� �����ϴ� �ݺ���
			var1--; //var1 = var1  + 1; -> byte 125�� 1�� ����
			var2--; //var2 = var2 + 1; -> int 125�� 1�� ����
			
			System.out.println("var1 : " + var1 + "          var2 : " + var2);
		}
		
	}

}

/* package ch02;

public class GarbageValueEx {

	public static void main(String[] args) {

		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0; i < 5; i++) { //���� i�� 0���� 5���� 1�� �����ϴ� �ݺ���
			var1++; //var1 = var1  + 1; -> byte 125�� 1�� ����
			var2++; //var2 = var2 + 1; -> int 125�� 1�� ����
			
			System.out.println("var1 : " + var1 + "          var2 : " + var2);
		}
		
	}

}*/
