package ch10.trywith;

public class FileInputStEx implements AutoCloseable{

	private String file; //�ʵ�
	
	//������
	public FileInputStEx(String file) {
		this.file = file;
	}
	
	//file�� �д� �޼ҵ�
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	//throws�� ���ܸ� ���ѱ�� �ڵ�
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");		
	}

}
