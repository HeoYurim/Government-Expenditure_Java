package ch10.trywith;

public class TryWithEx {

	public static void main(String[] args) {

		try(FileInputStEx fis = new FileInputStEx("file.txt")){
			fis.read(); //read() �޼ҵ� ȣ��
			throw new Exception(); //���������� ���� �߻���Ŵ
			
		}catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ���� �Ǿ����ϴ�.");
		}
		
	}

}
