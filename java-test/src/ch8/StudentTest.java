package ch8;

class Student{
	private String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "�л�[" + name + "]";
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		System.out.println(new Student("���"));
		System.out.println(new Student("ȫ�浿"));
	}

}
