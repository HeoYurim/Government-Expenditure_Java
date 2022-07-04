package ch13.genericWildcard;

import java.util.*;

public class WildCardEx {
	//모든 과정 수강용 (모든 수강생이 들을 수 있는 과정을 등록)
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	
	//학생만 들을 수 있는 과정
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	
	//직장인만 들을 수 있는 과정
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		studentCourse.add(new Student("일반인"));
		studentCourse.add(new HighStudent("일반인"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("일반인"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse); //학생 자식 클래스라 안됨
//		registerCourseStudent(workerCourse); //부모와 직장인의 클래스 안됨
		registerCourseStudent(studentCourse); //자신 클래스 가능
		registerCourseStudent(highStudentCourse); //자식 클래스라 가능
		System.out.println();
		
		registerCourseWorker(personCourse); //직장인 과정으로 부모 가능
		registerCourseWorker(workerCourse);  //직장인 자신이라 가능
//		registerCourseWorker(studentCourse);  //학생쪽에 자식이라 불가능
//		registerCourseWorker(highStudentCourse); //고등학생 쪽이라 불가능
		System.out.println();
	}
}
