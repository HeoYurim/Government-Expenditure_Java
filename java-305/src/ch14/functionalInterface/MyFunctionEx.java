package ch14.functionalInterface;

public class MyFunctionEx {

	public static void main(String[] args) {
		
		UsingThis ut = new UsingThis();
		UsingThis.Inner inner = ut.new Inner(); //���ٽ� �޼ҵ�
		inner.method();
		
		/* 01
		MyFunction fi;
		
		fi = () -> { //�Ű� ������ ���� ȣ��
			String str = "method call1";
			System.out.println(str);
		}; //�͸� �Լ�		
		fi.method(); //���๮ 2���� �޼ҵ� ����
		
		fi = () -> {System.out.println("method call2"); };		
		fi.method(); //���๮�� 1���� �޼ҵ� ����	
		
		fi = () -> System.out.println("method call3");		
		fi.method(); //���๮�� 1���� �޼ҵ� ������ �߰�ȣ ��� ���� ����
		*/
		
		/*02
		MyFunction fi;
		
		fi = (x) -> { //�Ű� ������ ���� ȣ��
			int result = x * 5;
			System.out.println(result); //x * 5 ���� ���
		}; //�͸� �Լ�		
		fi.method(2); //���๮ 2���� �޼ҵ� ���� 2 * 5 = 10
		
		fi = (x) -> {System.out.println(x * 5); };		
		fi.method(4); //���๮ 2���� �޼ҵ� ���� 4 * 5 = 10
		
		fi = (x) -> System.out.println(x * 5);		
		fi.method(8); //���๮�� 1���� �޼ҵ� ������ �߰�ȣ ��� ���� ����
		
		}
		 */
		
		/*03
		MyFunction fi;
		
		fi = (x,y) -> { //�Ű� ������ ���� ȣ��
			int result = x + y;
			return result; // x + y���� ���
		}; //�͸� �Լ�		
		System.out.println(fi.method(2 , 5)); //���๮ 2���� �޼ҵ� ���� 2 + 5 = 7
		
		fi = (x , y) -> {return x + y ;};		
		System.out.println(fi.method(2, 5)); //���Ϲ� ���� ���ٽ�
		
		fi = (x , y) -> x + y;		
		System.out.println(fi.method(8, 5)); //���๮�� 1���� �޼ҵ� ������ �߰�ȣ ��� ���� ����
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(9, 5)); //9 + 5 = 14
		}
		
		public static int sum(int x, int y) {
			return(x + y);
		}*/
		
		/*04
		UsingThis ut = new UsingThis();
		UsingThis.Inner inner = ut.new Inner(); //���ٽ� �޼ҵ�
		inner.method();
		*/
	}
}