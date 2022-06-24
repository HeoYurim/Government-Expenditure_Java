package ch03;

public class BitLogicEx {

	public static void main(String[] args) {

		System.out.println("45 & 25 -> " + (45 & 25));
		System.out.println("45 | 25 -> " + (45 | 25));
		System.out.println("45 ^ 25 -> " + (45 ^ 25));
		System.out.println("  ~45   -> " + (~45));
		
		System.out.println("------------------------");
		
		System.out.println("1 << 3 = " + (1 << 3));
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));
		
	}

}
