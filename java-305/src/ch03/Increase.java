package ch03;

public class Increase {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------------------------");
		
		x++;	//x = x + 1 -> 11
		++x;	//x = x + 1 -> 12
		
		System.out.println("x = " + x);		// 12
		
		System.out.println("-----------------------------------------");
		
		y--;	//y = y - 1 -> 9
		--y;	//y = y - 1 -> 8
		
		System.out.println("y = " + y);		// 8
		
		System.out.println("-----------------------------------------");
		
		z = x++;	//x���� z�� �ְ� x�� 1���� ��Ų��.
		System.out.println("z = " + z);		//12
		System.out.println("x = " + x);		//13
		
		System.out.println("-----------------------------------------");
		
		z = ++x;	//x�� 1���� ��Ű�� ���� ���� z�� �ִ´�.
		System.out.println("z = " + z);		//14
		System.out.println("x = " + x);		//14
		
		System.out.println("-----------------------------------------");
		
		z = ++x + y++; //z = (++14) + 8)++
		System.out.println("z = " + z);		//23 => z = ++14 + 8
		System.out.println("x = " + x);		//15 => ++14
		System.out.println("x = " + y);		//9  => n8++
		System.out.println("-----------------------------------------");
	}

}
