package ch10.trywith;

public class TryWithEx {

	public static void main(String[] args) {

		try(FileInputStEx fis = new FileInputStEx("file.txt")){
			fis.read(); //read() 메소드 호출
			throw new Exception(); //강제적으로 예외 발생시킴
			
		}catch(Exception e) {
			System.out.println("예외 처리 코드가 실행 되었습니다.");
		}
		
	}

}
