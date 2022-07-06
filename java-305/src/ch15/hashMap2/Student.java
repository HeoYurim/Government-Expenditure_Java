package ch15.hashMap2;

public class Student {
	//KEY로 사용할 라이브러리
	public int sno;
	public String name; //필드
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	} //생성자

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name)); //true값 리턴
		}else {
			return false; //false 값을 리턴
		}
	}
	
	@Override
	public int hashCode() { //해시코드 일치
		return sno + name.hashCode();
	}
	
}