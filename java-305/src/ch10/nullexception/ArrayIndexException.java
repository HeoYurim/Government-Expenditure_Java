package ch10.nullexception;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		//args ���� 2���� ���
		if(args.length == 2) {	
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]" + data1);
			System.out.println("args[1]" + data2);
			
		}else { //false�� �� ��¹�
			System.out.println("�Է°��� �߸� �Ǿ����ϴ�.");
			System.out.println("args�� �� 2���� �Է��ϼ���.");
		}
	}
}

