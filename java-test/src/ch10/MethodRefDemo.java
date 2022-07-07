package ch10;

interface Mathematical {double calculate(double d);} //�Լ��� �������̽�
interface Pickable {char pick(String s, int i);} //�Լ��� �������̽�
interface Computable {int compute(int x, int y);} //�Լ��� �������̽�

class Utils{ //�ν��Ͻ� �޼��� ���� ���� ��� ���Ͽ� �ν��Ͻ� �޼��带 ������ Ŭ������ ����
	int add(int a, int b) {return a + b;}
}

public class MethodRefDemo {

	public static void main(String[] args) {
		Mathematical m;
		Pickable p;
		Computable c;
		
		m = Math::abs; //���� �޼ҵ� ����
		System.out.println(m.calculate(-50.3));
		
		p = String::charAt; //�ν��Ͻ� �޼��� ���� 1�̴�.
		System.out.println(p.pick("�ȳ�, �ν��Ͻ� �޼��� ����!", 4));
		
		Utils utils = new Utils();
		c = utils::add; //�ν��Ͻ� �޼��� ���� 2�̴�.
		System.out.println(c.compute(20, 30));
	}

}
