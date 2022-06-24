package ch11.thinClone;

public class MemberExam {

	public static void main(String[] args) {
		Member orginal = new Member("kkw","김기원", "12345", 25, true);
		// 회원가입 자료를 Member 객체에 삽입
		
		Member cloned = orginal.getMember();
		// 복제 객체를 얻음
		cloned.pw = "54321";
		// 복제 객체의 암호를 변경함
		System.out.println("복제 객체의 필드 값");
		System.out.println("id : "+cloned.id);
		System.out.println("이름 : "+cloned.name);
		System.out.println("암호 : "+cloned.pw);
		System.out.println("나이 : "+cloned.age);
		System.out.println("성인인증 : "+cloned.adult);
		System.out.println("--------------------");
		System.out.println("원본 객체의 필드 값");
		System.out.println("id : "+orginal.id);
		System.out.println("이름 : "+orginal.name);
		System.out.println("암호 : "+orginal.pw);
		System.out.println("나이 : "+orginal.age);
		System.out.println("성인인증 : "+orginal.adult);
	}

}
