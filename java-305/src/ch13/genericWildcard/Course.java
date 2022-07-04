package ch13.genericWildcard;

public class Course<T> {
	//������ ���α׷�, �л�(����л�), �������� ���� �ڽ� ����
	private String name;
	private T[] students;
	//students��� Ÿ���� �迭�� ����
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		//Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n] ���·� �迭�� ������ �� ����.
		//(T[])(new Object[n]���� �����Ѵ�.
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	public void add(T t) { //�迭�� ����ִ� �κ��� ã�Ƽ� ������ �߰�
		for(int i = 0; i <students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}