package ch11.gc;

public class GcExam {

	public static void main(String[] args) {
		Employee emp = null;
		emp = new Employee(1);
		// emp ������ 1���� ���� ����
		emp = null;
		// emp ������ null�� �����Ͽ� 1�� ������ ����
		emp = new Employee(2);
		// emp ������ 2���� ���� ����
		emp = new Employee(3);
		// emp ������ 3���� ���� �����Ͽ� 2�� ���� ����
		// 1�� 2�� ��ü�� ������ ��ü
		
		System.out.println("emp�� ���������� �����ϴ� ��ȣ : " + emp.eno);
		System.gc();
	}

}

class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")�� �޸𸮿� �����Ǿ����ϴ�.");
	} // ������
	
	public void finalize() {
		System.out.println("Employee(" + eno + ")�� �޸𸮿� ���ŵǾ����ϴ�.");
	} // �Ҹ��� // gc()�� ����Ǹ鼭 ������ ���๮
}
