package ch8.Count;

public class CountableTest {

	public static void main(String[] args) {
		Countable[] m = {new Bird("���ٱ�"),new Bird("������"),new Tree("�������"),new Tree("�㳪��")};

		for(Countable e : m) {
			e.count();
		}
		
		for(int i = 0; i< m.length; i++) {
			if(m[i] instanceof Bird) {
				((Bird) m[i]).fly();
			}else {
				((Tree) m[i]).is();
			}
		}
	}

}
