package ch08;

public class CharSequenceTest {
	
	static void show(CharSequence cs) {
		System.out.println(cs);
	}

	public static void main(String[] args) {
		show(new String("���"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
	//	show(new Date());
	}

}
