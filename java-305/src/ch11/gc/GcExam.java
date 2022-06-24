package ch11.gc;

public class GcExam {

	public static void main(String[] args) {
		Employee emp = null;
		emp = new Employee(1);
		// emp 변수에 1번을 참조 연결
		emp = null;
		// emp 변수에 null을 지정하여 1번 참조를 해제
		emp = new Employee(2);
		// emp 변수에 2번을 참조 연결
		emp = new Employee(3);
		// emp 변수에 3번을 참조 연결하여 2번 연결 해제
		// 1번 2번 객체는 쓰레기 객체
		
		System.out.println("emp가 마지막으로 참조하는 번호 : " + emp.eno);
		System.gc();
	}

}

class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")가 메모리에 생성되었습니다.");
	} // 생성자
	
	public void finalize() {
		System.out.println("Employee(" + eno + ")가 메모리에 제거되었습니다.");
	} // 소멸자 // gc()가 실행되면서 나오는 실행문
}
