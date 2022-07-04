package ch13.genericWildcard;

import java.util.*;

public class WildCardEx {
	//��� ���� ������ (��� �������� ���� �� �ִ� ������ ���)
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������: " + Arrays.toString(course.getStudents()));
	}
	
	//�л��� ���� �� �ִ� ����
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "������: " + Arrays.toString(course.getStudents()));
	}
	
	//�����θ� ���� �� �ִ� ����
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("������ ����", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л� ����", 5);
		studentCourse.add(new Student("�Ϲ���"));
		studentCourse.add(new HighStudent("�Ϲ���"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л� ����", 5);
		highStudentCourse.add(new HighStudent("�Ϲ���"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse); //�л� �ڽ� Ŭ������ �ȵ�
//		registerCourseStudent(workerCourse); //�θ�� �������� Ŭ���� �ȵ�
		registerCourseStudent(studentCourse); //�ڽ� Ŭ���� ����
		registerCourseStudent(highStudentCourse); //�ڽ� Ŭ������ ����
		System.out.println();
		
		registerCourseWorker(personCourse); //������ �������� �θ� ����
		registerCourseWorker(workerCourse);  //������ �ڽ��̶� ����
//		registerCourseWorker(studentCourse);  //�л��ʿ� �ڽ��̶� �Ұ���
//		registerCourseWorker(highStudentCourse); //����л� ���̶� �Ұ���
		System.out.println();
	}
}
