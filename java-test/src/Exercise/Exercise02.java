package Exercise;

public class Exercise02 {

	public static void main(String[] args) {

		int x = 10;		//11
		int y = 20;		//20
		int z = (++x) + (y--);  //y는 11+20 하고 나중에 --됨
		System.out.println(z);
		
	}

}
