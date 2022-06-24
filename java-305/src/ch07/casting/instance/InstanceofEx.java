package ch07.casting.instance;

public class InstanceofEx {

	public static void method1(Parent parent){ //�Ű����� ������
		if(parent instanceof Child) { //parent�� �θ� ��ü���� �ڽ� ��ü���� �Ǵ�
			Child child = (Child) parent;
			System.out.println("method1 - child ��ȯ ����");
		}else {
			System.out.println("method1 - child ��ȯ ����");
		} //if�� ���� ����
	}//������ ���� ���� Ÿ�� ��ȯ
	
	public static void method2(Parent parent){ //�Ű����� ������
		
		Child child = (Child) parent;
		System.out.println("method2 - child ��ȯ ����");
		
	}//���� ���� ���� Ÿ�� ��ȯ
	
	public static void main(String[] args) {

		Parent parentA = new Child(); //�ڽ��� ���� �θ� ����
		method1(parentA); //����
		method2(parentA); //����
		
		Parent parentB = new Parent(); //�θ� ��ü ����
		method1(parentB); //����
//		method2(parentB); //������(�����Ϸ�)
		
		Child childA = new Child(); //�ڽ��� ���� �ڽ� ��ü ����
		method1(childA); //����
		method2(childA); //����
		
	}

}
