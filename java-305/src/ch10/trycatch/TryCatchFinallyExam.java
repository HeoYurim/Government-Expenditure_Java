package ch10.trycatch;

public class TryCatchFinallyExam {

	public static void main(String[] args) {

		try { //args�� ���� 2�������� Ȯ���ϴ� �����ڵ�
			String data1 = null;
			String data2 = null;
			data1 = args[0];
			data2 = args[1];
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);	

		}catch(ArrayIndexOutOfBoundsException  | NumberFormatException e) { //���� �߻��� ��¹�
				System.out.println("���� �Ű����� �����ϰų� �Ű����� ������ �ƴմϴ�..");
				System.out.println("args�� 2�� �������� �־��ּ���.");
						
		}catch(Exception e) { //���� ���� Ŭ���� (�� ġ�� ����!)
			System.out.println("���� �߻� ���α׷��ӿ��� �����ϼ���");
			
		}finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
		
		/*
		try { //args�� ���� 2�������� Ȯ���ϴ� �����ڵ�
			String data1 = null;
			String data2 = null;
			data1 = args[0];
			data2 = args[1];
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);	

		}catch(ArrayIndexOutOfBoundsException e) { //���� �߻��� ��¹�
				System.out.println("���� �Ű����� �����մϴ�.");
				System.out.println("args�� 2�� ���� �־��ּ���.");
						
		}catch(Exception e) { //���� ���� Ŭ���� (�� ġ�� ����!)
			System.out.println("���� �߻� ���α׷��ӿ��� �����ϼ���");
			
		}finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
		*/
		
		/*
		String data1 = null;
		String data2 = null;
		
		try { //args�� ���� 2�������� Ȯ���ϴ� �����ڵ�
			data1 = args[0];
			data2 = args[1];
			
		}catch(ArrayIndexOutOfBoundsException e) { //���� �߻��� ��¹�
			System.out.println("���� �Ű����� �����մϴ�.");
			System.out.println("args�� 2�� ���� �־��ּ���.");
			return;
		}
		
		try { //args�� �Է� ���� ������ ��ȯ�Ǵ� ���� �ڵ�
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
		}catch(NumberFormatException e) { //���� �߻��� ��¹�
			System.out.println("���ڷ� ��ȯ�� �� ���� args ���Դϴ�..");
			System.out.println("���ڷ� �ٽ� �Է��ϼ���..");
		}finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
		*/
	}
	
}
