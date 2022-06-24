package ch10.trywith;

public class FileInputStEx implements AutoCloseable{

	private String file; //필드
	
	//생성자
	public FileInputStEx(String file) {
		this.file = file;
	}
	
	//file을 읽는 메소드
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	//throws는 예외를 떠넘기는 코드
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");		
	}

}
