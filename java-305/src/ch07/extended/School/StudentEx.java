package ch07.extended.School;

public class StudentEx {

	public static void main(String[] args) {

		//String name, int height, int weight, int age, String studentID, int grade, int gPA
		Student stu1 = new Student("«„¿Ø∏≤", 170, 50, 24, "201858068", 4, 4);
		Student stu2 = new Student("MIT", 150, 40, 22, "20220511", 3, 2);
		
		stu1.show();
		stu2.show();
	}

}
