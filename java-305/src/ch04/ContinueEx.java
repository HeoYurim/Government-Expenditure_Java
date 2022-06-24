package ch04;

public class ContinueEx {

	public static void main(String[] args) {

		for(int i = 1; i <=10; i++) { //i°¡ 1~10±îÁö 1¾¿ Áõ°¡
			if(i%2 != 0) { //Â¦¼ö°¡ ¾Æ´Ô(È¦¼ö)
				continue;
			}
			System.out.println(i);
		}
		
	}

}
