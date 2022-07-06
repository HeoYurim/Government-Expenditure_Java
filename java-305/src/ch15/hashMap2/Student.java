package ch15.hashMap2;

public class Student {
	//KEY�� ����� ���̺귯��
	public int sno;
	public String name; //�ʵ�
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	} //������

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name)); //true�� ����
		}else {
			return false; //false ���� ����
		}
	}
	
	@Override
	public int hashCode() { //�ؽ��ڵ� ��ġ
		return sno + name.hashCode();
	}
	
}