package ch8;

class Student{
	private String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ÇÐ»ý[" + name + "]";
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		System.out.println(new Student("±è»ñ°«"));
		System.out.println(new Student("È«±æµ¿"));
	}

}
