package ch05;

public class MainStringArgEx {

	public static void main(String[] args) {

		if(args.length != 2) { //args�� �Է°��� 2������ �����ϴ� �ڵ�
			System.out.println("���α׷� ����");
			System.out.println("Java MainStringArgEx num1 num2");
			System.exit(0);	//���α׷� ���� ����
		}
		String strNum1 = args[0];	//String�� ù��° ���� strNum1�� �ִ´�.
		String strNum2 = args[1];	//String�� �ι�° ���� strNum2�� �ִ´�.
		
		int num1 = Integer.parseInt(strNum1);	//���ڷ� ���� ���ڸ� ���������� ��ȯ�Ѵ�.
		int num2 = Integer.parseInt(strNum2);	//���ڷ� ���� ���ڸ� ���������� ��ȯ�Ѵ�.

		int result = num1 + num2;	//���� 2���� ���ؼ� result�� ��ȯ
		System.out.println(num1 + " + " + num2 + " = "  + result);
	}

}
