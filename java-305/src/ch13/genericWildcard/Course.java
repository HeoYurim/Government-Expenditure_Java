package ch13.genericWildcard;

public class Course<T> {
	//교육장 프로그램, 학생(고등학생), 직장인의 교육 코스 개발
	private String name;
	private T[] students;
	//students라는 타입의 배열을 구현
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		//타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없다.
		//(T[])(new Object[n]으로 생성한다.
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	public void add(T t) { //배열의 비어있는 부분을 찾아서 수강생 추가
		for(int i = 0; i <students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}